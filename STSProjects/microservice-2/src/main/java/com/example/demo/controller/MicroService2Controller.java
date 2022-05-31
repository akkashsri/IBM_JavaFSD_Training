package com.example.demo.controller;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonDto;
import com.example.demo.service.PersonService;
import com.example.demo.ui.RespReqModel;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class Microservice2Controller {
	
	private final ModelMapper modelMapper;
	private final PersonService personService;
	private final Environment env;
	
	@RequestMapping("/")
	public ResponseEntity<?> getStatus() {
		return ResponseEntity.ok("MS-2-WS is up and running on port: " + env.getProperty("local.server.port"));
	}
	
	@GetMapping("/ms2/{name}/{age}")
	public ResponseEntity<?> createPerson(@PathVariable("name")String name, @PathVariable("age")int age) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		PersonDto personDto = modelMapper.map(RespReqModel.builder().name(name).age(age).build(), PersonDto.class);
		personDto.setPid(UUID.randomUUID().toString());
		
		PersonDto tempDto = personService.createPerson(personDto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(tempDto, RespReqModel.class));
	}

}

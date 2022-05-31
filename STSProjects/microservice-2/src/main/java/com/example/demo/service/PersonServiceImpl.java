package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonDto;
import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepository;
import com.example.demo.ui.RespReqModel;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {
	private final ModelMapper modelMapper;
	private final PersonRepository personRepository;

	@Override
	public PersonDto createPerson(PersonDto personDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Person person = modelMapper.map(personDto, Person.class);
		Person tempPerson = personRepository.save(person);
		
		return modelMapper.map(tempPerson, PersonDto.class);
	}

	@Override
	public List<PersonDto> findAll() {
		
		return null;
	}

	@Override
	public PersonDto findById(String id) {
		
		return null;
	}

	@Override
	public PersonDto findByName(String name) {

		return null;
	}

	@Override
	public PersonDto updateById(int id, RespReqModel respReqModel) {
		
		return null;
	}

	@Override
	public void deleteById(int id) {

		
	}

}

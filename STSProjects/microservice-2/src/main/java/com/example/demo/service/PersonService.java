package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PersonDto;
import com.example.demo.ui.RespReqModel;

public interface PersonService {
	
	PersonDto createPerson(PersonDto personDto);
	
	List<PersonDto> findAll();
	
	PersonDto findById(String id);
	
	PersonDto findByName(String name);
	
	PersonDto updateById(int id, RespReqModel respReqModel);
	
	void deleteById(int id);
	

}

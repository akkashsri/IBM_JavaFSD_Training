package com.example.demo;



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.model.SchoolEntity;
import com.example.demo.repo.SchoolRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
@EnableEurekaClient

public class SchoolService1Application {


private final SchoolRepository schoolRepository;
	public static void main(String[] args) {
		SpringApplication.run(SchoolService1Application.class, args);
	}
	@PostConstruct
	public void initDate() {
		List<SchoolEntity> list = Stream.of(new SchoolEntity(1,"AP public school"),
				new SchoolEntity(2,"vivekanand public school"))
				.collect(Collectors.toList());

		schoolRepository.saveAll(list);
	}
}

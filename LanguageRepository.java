package com.example.myfirstapp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.myfirstapp.controller.Language;


public interface LanguageRepository extends CrudRepository<Language, String>{
	public List<Language>  findByEmployeeId(String employeeId);

}
package com.example.myfirstapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstapp.LanguageRepository;
import com.example.myfirstapp.controller.Language;


@Service
public class LanguageService {
	@Autowired
     private LanguageRepository languageRepository;
	
	
	public List<Language> getAllLanguage(){
		List<Language> languagelist=new ArrayList<>();
		languageRepository.findAll().forEach(languagelist::add);
		return languagelist;
	}
	
	public Language getLanguage(String id) {
		return languageRepository.findById(id).get();
		
	}
	
	public void addLanguage(Language language) {
		languageRepository.save(language);
	}
	
	public void updateLanguage(String id,Language language) {
		languageRepository.save(language);
		
	}
	public void deleteLanguage(String id) {
		
		languageRepository.deleteById(id);
	}
}
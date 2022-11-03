package com.example.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.example.Kodlama.io.Devs.entities.Language;

public interface LanguageService {
	
	List<Language> getAll();
	Language getById(int id);
	
	void delete(Language language);
	void add(Language language) throws Exception;
	void update(Language language) throws Exception;


	
}

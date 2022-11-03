package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import com.example.Kodlama.io.Devs.entities.Language;
 import java.util.List;
public interface LanguageRepository {
	
	List<Language> getAll();
	Language getById(int id);
	void delete(Language language);
	void add(Language language);
	void update(Language language);
	
	

}
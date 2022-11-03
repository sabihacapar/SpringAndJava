package com.example.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.entities.Language;

public class InMemoryLanguageRepository implements LanguageService{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {


		languages = new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));


		
		
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

	@Override
	public Language getById(int id) {
		for(Language lang : languages) {
			if(lang.getId()== id) {
				return lang;
			}
		}

		return null;
	}

	@Override
	public void delete(Language language) {

		Language deletedLanguage = getById(language.getId());
		languages.remove(deletedLanguage);
	}

	@Override
	public void add(Language language) throws Exception {


		languages.add(language);
	}

	@Override
	public void update(Language language) throws Exception {
		Language deletedLanguage = getById(language.getId());
		((Language) languages).setLanguageName(language.getLanguageName());
		
	}

}

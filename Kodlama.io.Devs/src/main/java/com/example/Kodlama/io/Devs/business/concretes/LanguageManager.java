package com.example.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.example.Kodlama.io.Devs.entities.Language;

public class LanguageManager implements LanguageService{

	LanguageRepository languageRepository;
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		// TODO Auto-generated method stub
		return languageRepository.getById(id);
	}

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);		
		
	}

	@Override
	public void add(Language language) throws Exception {
	for(Language lang : getAll()) {
		if(lang.getLanguageName() == language.getLanguageName()) throw new Exception("Programlama dili aynı olamaz");
		else if(language.getLanguageName().isBlank()|| language.getLanguageName().isEmpty()) throw new Exception("Progralama dili alanı boş bırakılamaz");
		else {
			languageRepository.add(language);
		}
	}
	
	
	}

	@Override
	public void update(Language language) throws Exception {
		for(Language lang : getAll()) {
			if(lang.getLanguageName() == language.getLanguageName()) throw new Exception("Programlama dili aynı olamaz");
			else if(language.getLanguageName().isBlank()|| language.getLanguageName().isEmpty()) throw new Exception("Progralama dili alanı boş bırakılamaz");
			else {
				languageRepository.update(language);
			}
		}		
	}

}

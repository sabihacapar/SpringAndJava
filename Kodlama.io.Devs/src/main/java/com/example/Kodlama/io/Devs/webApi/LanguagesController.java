package com.example.Kodlama.io.Devs.webApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.entities.Language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
public class LanguagesController {
	
	LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	@GetMapping("/{id}")
	public Language getById(int id) {
		return languageService.getById(id);
	}
	@GetMapping("/delete")

	public void delete(Language language) {
		languageService.delete(language);
	}
	@GetMapping("/add")

	public void add(Language language)throws Exception {
		languageService.add(language);
	}
	@GetMapping("/update")

	public void update(Language language)throws Exception {
		languageService.update(language);
	}
	
	
	

}

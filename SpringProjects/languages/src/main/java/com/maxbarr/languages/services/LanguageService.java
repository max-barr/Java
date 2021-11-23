package com.maxbarr.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maxbarr.languages.repositories.LanguageRepository;
import com.maxbarr.languages.models.Language;

@Service
public class LanguageService {
//	adding the language repository as a dependency
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	// returns all the languages
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    // creates a language
    public Language createLanguage(Language language) {
        return languageRepository.save(language);
    }
    // retrieves a language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }

    public Language updateLanguage(Language language) {
    		return languageRepository.save(language);
    }
	
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
}

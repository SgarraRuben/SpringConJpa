package it.objectmethod.esercizioconjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import it.objectmethod.esercizioconjpa.entity.Country;
import it.objectmethod.esercizioconjpa.repository.CountryRepo;

@RestController
@RequestMapping("/api/country")
public class CountryController {
	@Autowired
	private  CountryRepo countryRepo;
	
	@GetMapping("/findName")
	public Country test(@RequestParam("Name") String name,@RequestParam("Continent") String continent) {
		Country country=countryRepo.findByNameAndContinent(name, continent);
		System.out.println(country);
		return  country;
		
	}
	
	@GetMapping("g")
	public List<Country> test() {
		List<Country> country=countryRepo.getCountryByName();
		
		return  country;
		
	}

}

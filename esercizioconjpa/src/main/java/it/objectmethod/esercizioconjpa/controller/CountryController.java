package it.objectmethod.esercizioconjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.esercizioconjpa.entity.Country;
import it.objectmethod.esercizioconjpa.repository.CountryRepo;

@RestController
@RequestMapping("/api/country")
public class CountryController {
	@Autowired
	private CountryRepo countryRepo;

	@GetMapping("/{code}/find")
	public Optional<Country> findById(@PathVariable("code") String code) {
		Optional<Country> c = countryRepo.findById(code);

		;
		return c;
	}

	@GetMapping("/findName")
	public Country test(@RequestParam("Name") String name, @RequestParam("Continent") String continent) {
		Country country = countryRepo.findByNameAndContinent(name, continent);
		System.out.println(country);
		return country;

	}

	@GetMapping("/getCountry")
	public List<Country> getCountry() {
		List<Country> country = countryRepo.getCountry();

		return country;

	}

	@GetMapping("/getOnlyName")
	public List<String> test() {
		List<String> country = countryRepo.getCountryName();

		return country;

	}

	@GetMapping("/getOnlyNameAndCountry")
	public List<String> set() {
		List<String> country = countryRepo.getCountryNameCity();

		return country;

	}

}

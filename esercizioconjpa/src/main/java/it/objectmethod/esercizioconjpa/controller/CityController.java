package it.objectmethod.esercizioconjpa.controller;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.esercizioconjpa.entity.City;
import it.objectmethod.esercizioconjpa.repository.CityRepo;

@RestController
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	private CityRepo cityRepo;
	


	@GetMapping("/findName")
	public City test(@RequestParam("Name") String name) {
		City city = cityRepo.findByName(name);
		System.out.println(city);
		return city;
	}

	@PostMapping("/addCity")
	public City addCity(@RequestBody City city) {
		cityRepo.save(city);
		return city;

	}

	@RequestMapping("/deleteCity")
	public Void deleteCity(@RequestBody City city) {
		cityRepo.delete(city);
		return null;

	}

}

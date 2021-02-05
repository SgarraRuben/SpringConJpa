package it.objectmethod.esercizioconjpa.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import it.objectmethod.esercizioconjpa.entity.*;


@Repository
public interface CountryRepo extends JpaRepository<Country,String>{
	
	public Country findByNameAndContinent(String name,String continent);
	
	
	@Query(value="SELECT * FROM country\r\n"
			+ "INNER JOIN city ON country.Capital = city.ID\r\n"
			+ "WHERE city.Population > 1000000" ,
			nativeQuery=true)
	public List<Country> getCountry();
	
	@Query(value="SELECT coutnry.Name FROM country\r\n"
			+ "INNER JOIN city ON country.Capital = city.ID\r\n"
			+ "WHERE city.Population > 1000000" ,
			nativeQuery=true)
	public List<String> getCountryName();
	
	
}



package it.objectmethod.esercizioconjpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import it.objectmethod.esercizioconjpa.entity.*;


@Repository
public interface CountryRepo extends JpaRepository<Country,String>{
	
	public Country findByNameAndContinent(String name,String continent);
	
	
	@Query("select c from Country c join City a on c.code = a.country where c.code = ?1")
	public Country getCountryByCountryCity(String codeCity);
}



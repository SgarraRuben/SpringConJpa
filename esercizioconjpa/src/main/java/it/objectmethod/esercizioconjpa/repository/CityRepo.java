package it.objectmethod.esercizioconjpa.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import it.objectmethod.esercizioconjpa.entity.*;
@Repository
public interface CityRepo extends JpaRepository<City,Long>{
	
	
	public City findByName(String name);
	
	

}

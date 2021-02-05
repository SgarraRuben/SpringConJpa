package it.objectmethod.esercizioconjpa.entity;

import java.util.List;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="city")
public class City {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Id
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	
	@Column(name="CountryCode")
	private String country;
	
	@Column(name="District")
	private String district;
	
	@Column(name="Population")
	private Integer population;
	
	/*@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Country c;*/
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	

}

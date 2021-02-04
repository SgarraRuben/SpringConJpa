package it.objectmethod.esercizioconjpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="country")
public class Country {
	
	@Id
	@Column(name="Code")
	private String code;
	
	@Column(name="Name")
	private String name;

	@Column(name="Continent")
	private String continent;
	
	@Column(name="Population")
	private Integer population;
	
	@Column(name="surfacearea")
	private float surface;
	
	@JoinColumn(name = "padre_id") 
     @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL) // OneToMany è il tipo di relazione

    private List<City> city;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}
	
}

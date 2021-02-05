package it.objectmethod.esercizioconjpa.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "Code")
	private String code;

	@Column(name = "Name")
	private String name;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Population")
	private Integer population;

	@Column(name = "surfacearea")
	private float surface;

	@Column(name = "Capital")
	private Long capital;

	/*
	 * @OneToMany(targetEntity=) private List<City> citys;
	 */

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

	public Long getCapital() {
		return capital;
	}

	public void setCapital(Long capital) {
		this.capital = capital;
	}

}

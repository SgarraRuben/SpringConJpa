package it.objectmethod.esercizioconjpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "city")
public class City {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@Column(name = "Name")
	private String name;

	//@Column(name = "CountryCode")

	private String countryCode;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column(name = "District")
	private String district;

	@Column(name = "Population")
	private Integer population;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CountryCode")

	private Country country;

	@ManyToMany
	@JoinTable(name = "city_tp", joinColumns = @JoinColumn(name = "id_city", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "Id_trasporti", referencedColumnName = "ServiziID"))
	// padri_auto tabella di correlazione tra padre e automobile, nelle joinColumns
	// indichiamo che padre_id (della tabella padri_auto) fa riferimo a id (della
	// tabella padre)
	// mentre in inverseJoinColumns indichiamo che auto_id (della tabella
	// padri_auto) fa riferimento a id (della tabella automobile).
	private List<TrasportiPubblici> trasportiPubblici;

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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;

	}

	public List<TrasportiPubblici> getTrasportiPubblici() {
		return trasportiPubblici;
	}

	public void setTrasportiPubblici(List<TrasportiPubblici> trasportiPubblici) {
		this.trasportiPubblici = trasportiPubblici;
	}

}

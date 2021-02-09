package it.objectmethod.esercizioconjpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "trasportiPubblici")
public class TrasportiPubblici {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	
	private int serviziID;

	@Column(name = "Name")
	private String name;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "city_tp", joinColumns = @JoinColumn(name = "id_trasporti", referencedColumnName = "ServiziID"), inverseJoinColumns = @JoinColumn(name = "id_city", referencedColumnName = "ID"))
	private List<City> city;

	public int getServiziID() {
		return serviziID;
	}

	public void setServiziID(int serviziID) {
		this.serviziID = serviziID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

}

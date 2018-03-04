package br.com.refrigeracao.entity.value.object;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import br.com.refrigeracao.entity.City;
import br.com.refrigeracao.entity.value.object.itrf.ValueObject;

@Embeddable
public class Adress implements ValueObject {

	@Column(length=200)
	private String street;
	
	@Column(length=50)
	private String adressNumber;
	
	@Column(length=200)
	private String neighborhood;
	
	@ManyToOne
	private City city;
	
	public Adress() {	
		
	}
	
	public Adress(String street, String adressNumber, String neighborhood, City city) {
		this.street = street;
		this.adressNumber = adressNumber;
		this.neighborhood = neighborhood;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAdressNumber() {
		return adressNumber;
	}

	public void setAdressNumber(String adressNumber) {
		this.adressNumber = adressNumber;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public boolean validade() {
		return false;
	}
}

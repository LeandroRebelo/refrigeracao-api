package br.com.refrigeracao.value.object;

import br.com.refrigeracao.entity.City;

public class Adress {

	private String street;
	private String number;
	private String neighborhood;
	private City city;
	
	public Adress(String street, String number, String neighborhood, City city) {
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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
}

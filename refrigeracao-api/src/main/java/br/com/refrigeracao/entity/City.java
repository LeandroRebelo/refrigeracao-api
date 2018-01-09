package br.com.refrigeracao.entity;

public class City {

	private Integer id;
	private String name;
	private char uf;
	
	public City(Integer id, String name, char uf) {
		this.id = id;
		this.name = name;
		this.uf = uf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getUf() {
		return uf;
	}

	public void setUf(char uf) {
		this.uf = uf;
	}	
}

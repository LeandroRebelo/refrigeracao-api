package br.com.refrigeracao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq_gen")
	@SequenceGenerator(name = "person_seq_gen", sequenceName = "person_id_seq")
	private Integer id;
	
	@Column(length=200)
	private String name;
	
	@Column(length=2, unique=true)
	private char uf;
	
	public City() {
		
	}
	
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

package br.com.refrigeracao.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class City {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@Column(length=200)
	private String name;
	
	@Column(length=2, unique=true)
	private char uf;
	
	public City(String name, char uf) {
		this.name = name;
		this.uf = uf;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
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

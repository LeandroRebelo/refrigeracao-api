package br.com.refrigeracao.entity.abs;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;

import br.com.refrigeracao.entity.value.object.Adress;
import br.com.refrigeracao.entity.value.object.Document;
import br.com.refrigeracao.entity.value.object.Name;


@MappedSuperclass
public abstract class Person {

	@Embedded
	private Name name;
	
	@Embedded
	private Document document;
	
	@Embedded
	private Adress adress;
	
	@Column
	private LocalDate birthDate;
	
	@Column
	private Integer phone;
	
	public Person(Name name, Document document, Adress adress, LocalDate birthDate, Integer phone) {
		this.name = name;
		this.document = document;
		this.adress = adress;
		this.birthDate = birthDate;
		this.phone = phone;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
}

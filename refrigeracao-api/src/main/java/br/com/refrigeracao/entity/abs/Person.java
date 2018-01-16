package br.com.refrigeracao.entity.abs;

import java.time.LocalDate;

import br.com.refrigeracao.value.object.Adress;
import br.com.refrigeracao.value.object.Document;
import br.com.refrigeracao.value.object.Name;

public abstract class Person {

	private Integer Id;
	private Name name;
	private Document document;
	private Adress adress;
	private LocalDate birthDate;
	private Integer phone;
	
	public Person(Name name, Document document, Adress adress, LocalDate birthDate, Integer phone) {
		this.name = name;
		this.document = document;
		this.adress = adress;
		this.birthDate = birthDate;
		this.setPhone(phone);
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

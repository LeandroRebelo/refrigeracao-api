package br.com.refrigeracao.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import br.com.refrigeracao.entity.abs.Person;
import br.com.refrigeracao.entity.value.object.Adress;
import br.com.refrigeracao.entity.value.object.Document;
import br.com.refrigeracao.entity.value.object.Name;


@Entity
public class Mechanical extends Person {

	public Mechanical(Name name, Document document, Adress adress, LocalDate birthDate, Integer phone) {
		super(name, document, adress, birthDate, phone);
	}

}

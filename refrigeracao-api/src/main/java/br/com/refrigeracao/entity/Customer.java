package br.com.refrigeracao.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.com.refrigeracao.entity.abs.Person;
import br.com.refrigeracao.entity.value.object.Adress;
import br.com.refrigeracao.entity.value.object.Document;
import br.com.refrigeracao.entity.value.object.Name;

@Entity
public class Customer extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq_gen")
	@SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_id_seq")
	private Integer Id;
	
	public Customer(Name name, Document document, Adress adress, LocalDate birthDate, Integer phone) {
		super(name, document, adress, birthDate, phone);
	}

}

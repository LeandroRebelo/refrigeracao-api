package br.com.refrigeracao.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import br.com.refrigeracao.entity.abs.Person;
import br.com.refrigeracao.entity.value.object.Adress;
import br.com.refrigeracao.entity.value.object.Document;
import br.com.refrigeracao.entity.value.object.Name;

@Entity
public class User extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
	@SequenceGenerator(name = "user_seq_gen", sequenceName = "user_id_seq")
	private Integer Id;
	
	@Column(length = 50)
	private String user;

	@Column(length = 50)
	private String password;

	@OneToOne
	private Mechanical mechanical;

	public User(String user, String password, Mechanical mechanical, Name name, Document document, Adress localAdress,
			LocalDate birthDate, Integer phone) {
		super(name, document, localAdress, birthDate, phone);
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Mechanical getMechanical() {
		return mechanical;
	}

	public void setMechanical(Mechanical mechanical) {
		this.mechanical = mechanical;
	}
}
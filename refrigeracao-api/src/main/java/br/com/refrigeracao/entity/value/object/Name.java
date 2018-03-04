package br.com.refrigeracao.entity.value.object;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.com.refrigeracao.entity.value.object.itrf.ValueObject;

@Embeddable
public class Name implements ValueObject {

	@Column(length=200)
	private String name;
	
	@Column(length=200)
	private String lastName;
	
	public Name() {	
		
	}
	
	public Name(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean validade() {
		return false;
	}
}

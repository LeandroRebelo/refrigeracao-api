package br.com.refrigeracao.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import br.com.refrigeracao.entity.enums.EUnityType;


@Entity
public class Unity {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@Column(length=200)
	private String name;
	
	@Enumerated(EnumType.ORDINAL)
	private EUnityType unityType;
	
	public Unity(String name, EUnityType unityType) {
		this.name = name;
		this.unityType = unityType;
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

	public EUnityType getUnityType() {
		return unityType;
	}

	public void setUnityType(EUnityType unityType) {
		this.unityType = unityType;
	}	
}

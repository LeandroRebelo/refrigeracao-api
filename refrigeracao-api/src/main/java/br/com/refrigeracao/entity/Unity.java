package br.com.refrigeracao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.com.refrigeracao.entity.enums.EUnityType;


@Entity
public class Unity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="unity_seq_gen")
	@SequenceGenerator(name="unity_seq_gen", sequenceName = "unity_id_seq")
	private Integer id;
	
	@Column(length=200)
	private String name;
	
	@Enumerated(EnumType.ORDINAL)
	private EUnityType unityType;
	
	public Unity() {
		
	}
	
	public Unity(Integer id, String name, EUnityType unityType) {
		this.id = id;
		this.name = name;
		this.unityType = unityType;
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

	public EUnityType getUnityType() {
		return unityType;
	}

	public void setUnityType(EUnityType unityType) {
		this.unityType = unityType;
	}	
}

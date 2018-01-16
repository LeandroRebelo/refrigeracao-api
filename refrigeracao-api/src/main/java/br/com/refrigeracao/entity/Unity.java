package br.com.refrigeracao.entity;

import br.com.refrigeracao.enums.EUnityType;

public class Unity {

	private Integer id;
	private String name;
	private EUnityType unityType;
	
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

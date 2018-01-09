package br.com.refrigeracao.value.object;

import br.com.refrigeracao.enums.EDocumentType;

public class Document {
	
	private Integer number;
	private EDocumentType documentType;
	
	public Document(Integer number, EDocumentType documentType) {
		this.number = number;
		this.documentType = documentType;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public EDocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(EDocumentType documentType) {
		this.documentType = documentType;
	}
	
	public boolean Validate() {
		return true;
	}
	
}

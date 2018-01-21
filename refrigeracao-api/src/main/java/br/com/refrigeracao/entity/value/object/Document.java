package br.com.refrigeracao.entity.value.object;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.refrigeracao.entity.enums.EDocumentType;


@Embeddable
public class Document {
	
	@Column
	private Integer documentNumber;
	
	@Enumerated(EnumType.STRING)
	private EDocumentType documentType;
	
	public Document() {
		
	}
	
	public Document(Integer documentNumber, EDocumentType documentType) {
		this.documentNumber = documentNumber;
		this.documentType = documentType;
	}

	public Integer getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(Integer documentNumber) {
		this.documentNumber = documentNumber;
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

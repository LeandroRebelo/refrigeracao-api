package br.com.refrigeracao.entity.abs;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import br.com.refrigeracao.entity.Unity;

@MappedSuperclass
public abstract class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq_gen")
	@SequenceGenerator(name = "item_seq_gen", sequenceName = "item_id_seq")
	private Integer id;
	
	@Column(length=200)
	private String name;
	
	@Column
	private BigDecimal price;
	
	@ManyToOne
	private Unity unity;

	public Item(String name, BigDecimal price, Unity unity) {
		this.name = name;
		this.price = price;
		this.unity = unity;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Unity getUnity() {
		return unity;
	}

	public void setUnity(Unity unity) {
		this.unity = unity;
	}
	
}

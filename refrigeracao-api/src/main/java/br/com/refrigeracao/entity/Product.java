package br.com.refrigeracao.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

import br.com.refrigeracao.entity.abs.Item;

@Entity
public class Product extends Item{

	public Product(String name, BigDecimal price, Unity unity) {
		super(name, price, unity);
	}

}

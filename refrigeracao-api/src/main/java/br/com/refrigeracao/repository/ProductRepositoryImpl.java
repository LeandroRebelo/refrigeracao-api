package br.com.refrigeracao.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.refrigeracao.entity.Product;
import br.com.refrigeracao.repository.itrf.ProductRepository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@Override
	public Product save(Product obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getByID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

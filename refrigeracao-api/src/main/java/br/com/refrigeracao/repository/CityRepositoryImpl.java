package br.com.refrigeracao.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.refrigeracao.entity.City;
import br.com.refrigeracao.repository.itrf.CityRepository;

@Repository
public class CityRepositoryImpl implements CityRepository {

	@Override
	public City save(City obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public City getByID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

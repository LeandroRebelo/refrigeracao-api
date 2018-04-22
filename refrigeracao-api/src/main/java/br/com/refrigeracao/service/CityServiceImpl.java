package br.com.refrigeracao.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.refrigeracao.entity.City;
import br.com.refrigeracao.repository.CityRepository;
import br.com.refrigeracao.service.itrf.CityService;

@Service
public class CityServiceImpl implements CityService<City> {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public City save(City obj) {
		return cityRepository.save(obj);
	}

	@Override
	public void delete(UUID id) {
		cityRepository.delete(id);
	}

	@Override
	public City getByID(UUID id) {
		return cityRepository.getOne(id) ;
	}

	@Override
	public List<City> getAll() {
		return cityRepository.findAll();
	}
}

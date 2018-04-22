package br.com.refrigeracao.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.refrigeracao.entity.City;

public interface CityRepository extends JpaRepository<City, UUID> {

	
}

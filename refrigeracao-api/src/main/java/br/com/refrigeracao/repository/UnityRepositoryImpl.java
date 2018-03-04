package br.com.refrigeracao.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.refrigeracao.entity.Unity;
import br.com.refrigeracao.repository.itrf.UnityRepository;

@Repository
public class UnityRepositoryImpl implements UnityRepository {

	@Override
	public Unity save(Unity obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Unity getByID(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Unity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

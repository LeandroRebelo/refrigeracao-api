package br.com.refrigeracao.service.itrf;

import java.util.List;
import java.util.UUID;

public interface ServiceBase<T> {

	T save(T obj);
	
	void delete(UUID id);
	
	T getByID(UUID id);
	
	List<T> getAll();
}

package br.com.refrigeracao.repository.itrf;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface RepositoryBase<T> extends Repository<T, UUID> {

	public T save(T obj);
	
	public void delete(UUID id);
	
	public T getByID(UUID id);
	
	public List<T> getAll();
}

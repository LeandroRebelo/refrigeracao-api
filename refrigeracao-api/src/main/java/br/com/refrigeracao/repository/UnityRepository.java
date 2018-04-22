package br.com.refrigeracao.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.refrigeracao.entity.Unity;

public interface UnityRepository extends JpaRepository<Unity, UUID> {

}

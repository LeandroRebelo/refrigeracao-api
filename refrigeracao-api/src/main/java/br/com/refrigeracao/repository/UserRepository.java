package br.com.refrigeracao.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.refrigeracao.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}

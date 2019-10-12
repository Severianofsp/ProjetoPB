package br.com.develop.PointBrasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.develop.PointBrasa.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	String findByLogin(String login);

}

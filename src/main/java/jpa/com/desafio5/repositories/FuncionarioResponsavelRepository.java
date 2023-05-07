package jpa.com.desafio5.repositories;


import jpa.com.desafio5.modells.FuncionarioResponsavel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuncionarioResponsavelRepository extends JpaRepository<FuncionarioResponsavel, Integer> {
}

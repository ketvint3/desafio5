package jpa.com.desafio5.repositories;


import jpa.com.desafio5.modells.EstoqueMovimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueMovimentoRepository extends JpaRepository<EstoqueMovimento, Integer> {
}

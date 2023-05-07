package jpa.com.desafio5.repositories;


import jpa.com.desafio5.modells.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    public List <Produto> findByDescricaoContainingIgnoreCase(String descricao);


}

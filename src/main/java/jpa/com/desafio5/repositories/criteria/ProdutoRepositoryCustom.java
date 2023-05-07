package jpa.com.desafio5.repositories.criteria;


import jpa.com.desafio5.modells.Produto;
import jpa.com.desafio5.repositories.criteria.params.ProdutoFilterParam;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProdutoRepositoryCustom {
    List<Produto> getFiltro (ProdutoFilterParam param);

    List<Produto>positivo(Integer codigo);
}


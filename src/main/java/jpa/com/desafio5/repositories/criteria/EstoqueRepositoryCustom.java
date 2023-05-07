package jpa.com.desafio5.repositories.criteria;



import jpa.com.desafio5.modells.EstoqueMovimento;
import jpa.com.desafio5.repositories.criteria.params.ProdutoFilterParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstoqueRepositoryCustom {
    List<EstoqueMovimento> getFiltro(ProdutoFilterParam param);
}

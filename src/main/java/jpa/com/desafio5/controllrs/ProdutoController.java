package jpa.com.desafio5.controllrs;



import jpa.com.desafio5.modells.Produto;
import jpa.com.desafio5.repositories.criteria.params.ProdutoFilterParam;
import jpa.com.desafio5.services.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class ProdutoController {
    private ProdutoService service;

    //adicionar
    @GetMapping(value = "/adicionar")
    public ResponseEntity novoProduto(@RequestBody Produto produto) {
        return new ResponseEntity(produto, HttpStatus.CREATED);
    }


    //listar

    @GetMapping(value = "/listar")
    public ResponseEntity listarProduto() {
        return new ResponseEntity(service.listarTudo(), HttpStatus.OK);
    }
    @GetMapping(value = "/nome/{busca}")
    public ResponseEntity listarPorNome(@RequestParam(defaultValue = "") String busca) {
        return new ResponseEntity(service.listarPorNome(busca), HttpStatus.OK);
    }

    //atualizar
    @PutMapping(value = "/atualizar/{codigo}")
    public ResponseEntity update(@PathVariable Integer codigo, @RequestBody Produto produto) {
        service.update(codigo, produto);
        return new ResponseEntity("Produto " + codigo + " atualizado com sucesso!", HttpStatus.OK);
    }


    //deletar
    @DeleteMapping(value = "/deletar/{codigo}")
    public ResponseEntity deletar(@PathVariable Integer codigo) {
        service.remover(codigo);
        return new ResponseEntity("Produto " + codigo + " deletado com sucesso!", HttpStatus.OK);
    }

    //filtros


    @GetMapping(value = "/filtrar")
    public ResponseEntity filtrar(ProdutoFilterParam param) {
        return new ResponseEntity(service.filtrar(param), HttpStatus.OK);

    }

 // erro:  Ambiguous mapping = mapeamento ambiguo:ele nao consegue definir qual é qual (ex pode estar escrito igual)

    @GetMapping(value = "/filtrarprodutoscadastrados")
    public ResponseEntity filtrarProdutosCadastrados(@RequestParam(required = false) String descricao,
                                                     @RequestParam(required = false) BigDecimal precoVenda,
                                                     @RequestParam(required = false) Integer saldoAtual) {


        return new ResponseEntity(service.filtrar(new ProdutoFilterParam()), HttpStatus.OK);
    }


}

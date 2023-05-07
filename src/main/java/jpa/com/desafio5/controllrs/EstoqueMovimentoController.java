package jpa.com.desafio5.controllrs;



import jpa.com.desafio5.modells.EstoqueMovimento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstoqueMovimentoController {

    private EstoqueMovimentoController estoqueMovimentoService;


    //adicionar
    @GetMapping(value = "/adicionar/estoque")
    public ResponseEntity novoEstoque(@RequestBody EstoqueMovimento estoqueMovimento) {
        return new ResponseEntity(estoqueMovimento, HttpStatus.CREATED);
    }
    //listar
    @GetMapping(value = "/listar")
    public ResponseEntity listarTodosFuncionario() {
        return new ResponseEntity(estoqueMovimentoService.listaTudo(), HttpStatus.OK);
    }

    private Object listaTudo() {
        return null;
    }

    public ResponseEntity listarHistoricoEstoque(Integer codigo){
        return new ResponseEntity(estoqueMovimentoService.listarHistoricoEstoque(codigo),HttpStatus.OK);
    }

    //deletar
    @DeleteMapping
    public ResponseEntity deletar(@PathVariable Integer codigo) {
        estoqueMovimentoService.remover(codigo);
        return new ResponseEntity(HttpStatus.OK);


    }

    private void remover(Integer codigo) {
    }
    //alterar


    @PutMapping(value = "/atualizarEstoque/{codigo}")
    public ResponseEntity atualizarEstoque(@PathVariable Integer codigo, @RequestBody EstoqueMovimento estoqueMovimento){
        estoqueMovimentoService.update(codigo, estoqueMovimento);
        return new ResponseEntity(codigo, HttpStatus.OK);
    }

    private void update(Integer codigo, EstoqueMovimento estoqueMovimento) {
    }
}

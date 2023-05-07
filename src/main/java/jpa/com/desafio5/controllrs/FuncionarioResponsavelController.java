package jpa.com.desafio5.controllrs;



import jpa.com.desafio5.modells.FuncionarioResponsavel;
import jpa.com.desafio5.services.FuncionarioResponsavelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FuncionarioResponsavelController {

    private FuncionarioResponsavelService serviceF;


    //adicionar
    @GetMapping(value = "/funcionario/adicionar")
    public ResponseEntity novoFuncionario(@RequestBody FuncionarioResponsavel funcionarioResponsavel) {
        return new ResponseEntity(funcionarioResponsavel, HttpStatus.CREATED);
    }


    //listar
    @GetMapping(value = "/funcionario/listar")
    public ResponseEntity listarTodosFuncionario() {
        return new ResponseEntity(serviceF.buscarCodigo(), HttpStatus.OK);
    }

    //deletar
    @DeleteMapping(value = "/funcionario/delete")
    public ResponseEntity deletar(@PathVariable Integer codigo) {
        serviceF.remover(codigo);
        return new ResponseEntity(HttpStatus.OK);


    }
    //alterar


    @PutMapping(value = "/Funcionario/{codigo}")
    public ResponseEntity atualizarFuncionario(@PathVariable Integer codigo, @RequestBody FuncionarioResponsavel funcionarioResponsavel){
        serviceF.update(codigo, funcionarioResponsavel);
        return new ResponseEntity("Funcionario " + codigo + " atualizado com sucesso!", HttpStatus.OK);
    }
}


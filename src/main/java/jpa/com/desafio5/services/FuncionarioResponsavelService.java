package jpa.com.desafio5.services;



import jpa.com.desafio5.modells.FuncionarioResponsavel;
import jpa.com.desafio5.repositories.FuncionarioResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioResponsavelService {
    @Autowired
    private FuncionarioResponsavelRepository funcionarioResponsavelRepository;

    public List<FuncionarioResponsavel> buscarCodigo() {

        return (List<FuncionarioResponsavel>) funcionarioResponsavelRepository;
    }
//listartodos

    public List<FuncionarioResponsavel> listarTudo () {
        return funcionarioResponsavelRepository.findAll();

    }

    //criar
    private void adicionar(FuncionarioResponsavel funcionarioSalvo) {
        funcionarioResponsavelRepository.save(funcionarioSalvo);
    }

    //deletar
    private void remove(Integer codigo) {
        funcionarioResponsavelRepository.deleteById(codigo);
    }

    //buscar
    private FuncionarioResponsavel buscarCodigo(Integer codigo) {
        Optional<FuncionarioResponsavel> optionalDeFuncionario = funcionarioResponsavelRepository.findById(codigo);
        if (optionalDeFuncionario.isPresent()) {
            return optionalDeFuncionario.get();
        }
        return null;
    }

    //atualizar
    private void atualizar(Integer codigo) {
        if (funcionarioResponsavelRepository.existsById(codigo)) {
            funcionarioResponsavelRepository.deleteById(codigo);
        }
    }

    public void update(Integer codigo, FuncionarioResponsavel funcionarioResponsavel) {
        if (funcionarioResponsavelRepository.existsById(codigo)){
            funcionarioResponsavelRepository.save(funcionarioResponsavel);
        }

    }





    public void remover (Integer codigo) {
        if (funcionarioResponsavelRepository.existsById(codigo)) {
            funcionarioResponsavelRepository.deleteById(codigo);
        }
    }

}

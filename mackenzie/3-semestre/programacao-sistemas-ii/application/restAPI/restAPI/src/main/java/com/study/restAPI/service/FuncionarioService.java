package com.study.restAPI.service;

import com.study.restAPI.controller.params.FuncionarioParams;
import com.study.restAPI.repository.FuncionarioRepository;
import com.study.restAPI.repository.entity.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario getFuncionario (Long nuMat) {
        return funcionarioRepository.findByNumat(nuMat);
    }

    public void deleteFuncionario(Long nuMat) {
        funcionarioRepository.deleteByNumat(nuMat);
    }

    public void createFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public void updateFuncionario(Long nuMat, FuncionarioParams updatedFuncionario) {
        Funcionario funcionario = funcionarioRepository.findByNumat(nuMat);

        Funcionario
            .builder()
            .id(funcionario.getId())
            .numat(funcionario.getNumat())
            .nome(
                updatedFuncionario.getNome() == null
                    ? funcionario.getNome()
                    : updatedFuncionario.getNome()
            )
            .salario(
                updatedFuncionario.getSalario() == null
                    ? funcionario.getSalario()
                    : updatedFuncionario.getSalario()
            )
            .sexo(
                updatedFuncionario.getSexo() == null
                    ? funcionario.getSexo()
                    : updatedFuncionario.getSexo()
            )
            .ndepto(
                updatedFuncionario.getNdepto() == null
                    ? funcionario.getNdepto()
                    : updatedFuncionario.getNdepto()
            )
            .nsuper(
                updatedFuncionario.getNsuper() == null
                    ? funcionario.getNsuper()
                    : updatedFuncionario.getNsuper()
            )
            .build();

        funcionarioRepository.save(funcionario);
    }

}

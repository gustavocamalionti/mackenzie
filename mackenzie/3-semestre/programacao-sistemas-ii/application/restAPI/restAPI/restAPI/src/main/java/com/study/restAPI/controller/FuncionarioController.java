package com.study.restAPI.controller;

import com.study.restAPI.controller.params.FuncionarioParams;
import com.study.restAPI.repository.entity.Funcionario;
import com.study.restAPI.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;


    @GetMapping("/{nuMat}")
    public Funcionario getFuncionario(
        @PathVariable("nuMat") Long nuMat
    ) {
        return funcionarioService.getFuncionario(nuMat);
    }

    @DeleteMapping("/{nuMat}")
    public void deleteFuncionario (
        @PathVariable("nuMat") Long nuMat
    ) {
        funcionarioService.deleteFuncionario(nuMat);
    }

    @PutMapping("/{nuMat}")
    public void updateFuncionario (
        @PathVariable("nuMat") Long nuMat,
        FuncionarioParams funcionarioParams
    ) {
        funcionarioService.updateFuncionario(nuMat, funcionarioParams);
    }

    @PostMapping
    public void createFuncionario (
        Funcionario funcionario
    ) {
        funcionarioService.createFuncionario(funcionario);
    }

}

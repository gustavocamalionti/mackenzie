package com.example.empresa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empresa.model.Funcionario;

public interface FuncionarioRepo extends JpaRepository<Funcionario, Long> {

}

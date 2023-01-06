package com.study.restAPI.repository;

import com.study.restAPI.repository.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Funcionario findByNumat(Long numat);

    void deleteByNumat(Long numat);

}

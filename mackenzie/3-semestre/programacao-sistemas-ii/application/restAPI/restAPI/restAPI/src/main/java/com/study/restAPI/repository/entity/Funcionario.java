package com.study.restAPI.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Long numat;

    @Column
    private String nome;

    @Column
    private Double salario;

    @Column
    private Character sexo;

    @Column
    private Integer ndepto;

    @Column
    private Long nsuper;

}

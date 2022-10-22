package com.example.empresa.model;

import javax.persistence.*;

@Entity
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

    public Funcionario(Long numat, String nome, Double salario, Character sexo, Integer ndepto, Long nsuper) {
        this.numat = numat;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
        this.ndepto = ndepto;
        this.nsuper = nsuper;
    }

    public Funcionario() {
    }

    public Long getNumat() {
        return numat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Character getSexo() {
        return sexo;
    }

    public Integer getNdepto() {
        return ndepto;
    }

    public Long getNsuper() {
        return nsuper;
    }

    public void setNumat(Long numat) {
        this.numat = numat;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setNdepto(Integer ndepto) {
        this.ndepto = ndepto;
    }

    public void setNsuper(Long nsuper) {
        this.nsuper = nsuper;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "numat=" + numat +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", sexo=" + sexo +
                ", ndepto=" + ndepto +
                ", nsuper=" + nsuper +
                '}';
    }
}

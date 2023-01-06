package com.study.restAPI.controller.params;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(
    ignoreUnknown = true
)
@Builder
public class FuncionarioParams {

    private String nome;

    private Double salario;

    private Character sexo;

    private Integer ndepto;

    private Long nsuper;

}

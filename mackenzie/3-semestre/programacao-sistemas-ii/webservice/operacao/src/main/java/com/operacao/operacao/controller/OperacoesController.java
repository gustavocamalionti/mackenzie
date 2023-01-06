package com.operacao.operacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OperacoesController {
	
	
	@GetMapping("/sistema/rest/funcionarios")
	@ResponseBody
	public String funcionarios(){
		return "teste";		
	}
	
	@GetMapping("/sub/{n1}/{n2}")
	@ResponseBody
	public String subtracao(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2 ){
		int subtracao = n1-n2;
		return "A SUBTRAÇÃO entre " + n1 + " e " + n2 + " vale: " + subtracao;		
	}
	
	@GetMapping("/div/{n1}/{n2}")
	@ResponseBody
	public String divisao(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2 ){
		double divisao = n1/n2;
		return "A DIVISÃO entre " + n1 + " e " + n2 + " vale: " + divisao;		
	}
	
	@GetMapping("/mult/{n1}/{n2}")
	@ResponseBody
	public String multiplicacao(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2 ){
		int multiplicacao = n1*n2;
		return "A MULTIPLICAÇÃO entre " + n1 + " e " + n2 + " vale: " + multiplicacao;		
	}
}

package com.example.empresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TesteController {
	
	
	@GetMapping("/sistema/rest/funcionarios")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

}

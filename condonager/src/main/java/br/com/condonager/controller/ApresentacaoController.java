package br.com.condonager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Apresentacao")
public class ApresentacaoController {
	
	@RequestMapping("inicio")
	public String home(){
		return "inicio";
	}
	
	@RequestMapping("somos")
	public String somos(){
		return "somos";
	}
	@RequestMapping("contato")
	public String contato(){
		return "contato";
	}

	@RequestMapping("servico")
	public String servico(){
		return "servico";
	}
	

}

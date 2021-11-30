package com.silviney.catalogovideos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.silviney.catalogovideos.service.ProdutorService;

@Controller
public class CatalogoVideosCrudController {
	
	private final ProdutorService produtorService;

	public CatalogoVideosCrudController(ProdutorService produtorService) {
		this.produtorService = produtorService;
	}

	@RequestMapping("/filmes/criar")
	public String mostrarForm(Model model) {
		model.addAttribute("produtores", produtorService.buscarTodos());
		return "formFilmes";
	}
	
}

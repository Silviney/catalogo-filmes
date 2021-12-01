package com.silviney.catalogovideos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.silviney.catalogovideos.domain.Produtor;
import com.silviney.catalogovideos.domain.Videos;
import com.silviney.catalogovideos.service.CatalogoVideosService;
import com.silviney.catalogovideos.service.ProdutorService;

@Controller
public class CatalogoVideosCrudController {
	
	private final ProdutorService produtorService;
	private final CatalogoVideosService catalogoVideosService;

	public CatalogoVideosCrudController(ProdutorService produtorService, CatalogoVideosService catalogoVideosService) {
		this.produtorService = produtorService;
		this.catalogoVideosService = catalogoVideosService;
	}

	@RequestMapping("/filmes/criar")
	public String mostrarForm(Model model) {
		model.addAttribute("produtores", produtorService.buscarTodos());
		model.addAttribute("videos", new Videos());
		return "formFilmes";
	}
	
	@PostMapping("/filmes/salvar")
	public String salvar(Videos videos) {
		catalogoVideosService.salvar(videos);
		return "redirect:/";
	}	
}

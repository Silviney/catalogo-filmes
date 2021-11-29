package com.silviney.catalogovideos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.silviney.catalogovideos.domain.Videos;
import com.silviney.catalogovideos.service.CatalogoVideosService;

@Controller
public class CatalogoVideosController {

	private final CatalogoVideosService catalogoVideosService; 

	public CatalogoVideosController(CatalogoVideosService catalogoVideosService) {
		this.catalogoVideosService = catalogoVideosService;
	}
	
	@RequestMapping("/")
	public String listaCatalogo (Model model) {
		List<Videos> vd = catalogoVideosService.buscarVideos();
		model.addAttribute("videos", vd);
		return "lista";
	}
	
	@RequestMapping("/videosPorProdutor")
	public String listarVideosPorProdutor(int produtorId, Model model) {
		List<Videos> filmes = catalogoVideosService.buscarPorProdutor(produtorId);
		model.addAttribute("videos",filmes);
		return "lista";
	}
	
	@RequestMapping("/buscar")
	public String buscar(@RequestParam ("q") String consulta, Model model) {
		List<Videos> videos = catalogoVideosService.buscar(consulta);
		model.addAttribute("videos", videos);
		return "lista";
	}
	
}


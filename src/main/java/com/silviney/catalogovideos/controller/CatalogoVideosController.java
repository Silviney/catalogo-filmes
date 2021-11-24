package com.silviney.catalogovideos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

package com.silviney.catalogovideos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.silviney.catalogovideos.domain.Videos;
import com.silviney.catalogovideos.repository.CatalogoVideosRepository;

@Service
public class CatalogoVideosService {
	
	private final CatalogoVideosRepository catalogoVideosRepository;

	public CatalogoVideosService(CatalogoVideosRepository catalogoVideosRepository) {
		super();
		this.catalogoVideosRepository = catalogoVideosRepository;
	}

	public List<Videos> buscarVideos(){
		return catalogoVideosRepository.buscarTodosOrdenados();
	}
	
	public List<Videos> buscarPorProdutor(int produtorId){
		return catalogoVideosRepository.buscarPorProdutor(produtorId);
	}
	
	public List<Videos> buscar (String consulta) {
		return catalogoVideosRepository.buscar(consulta);
	}
	
}

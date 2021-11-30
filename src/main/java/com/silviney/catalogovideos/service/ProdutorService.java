package com.silviney.catalogovideos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.silviney.catalogovideos.domain.Produtor;
import com.silviney.catalogovideos.repository.ProdutorRepository;

@Service
public class ProdutorService {

	private final ProdutorRepository produtorRepository;

	public ProdutorService(ProdutorRepository produtorRepository) {
		this.produtorRepository = produtorRepository;
	}
	
	public List<Produtor> buscarTodos(){
		return produtorRepository.findAll();
	}
	
}

package com.silviney.catalogovideos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.silviney.catalogovideos.domain.Videos;

public interface CatalogoVideosRepository extends JpaRepository<Videos, Integer> {

	@Query("from Videos v order by v.nome")
	List<Videos> buscarTodosOrdenados();
	
}

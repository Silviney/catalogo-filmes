package com.silviney.catalogovideos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silviney.catalogovideos.domain.Videos;

public interface CatalogoVideosRepository extends JpaRepository<Videos, Integer> {

}

package com.example.videogame_product_microservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.videogame_product_microservice.repository.entity.Videogame;

@Repository
public interface VideogameRepository extends CrudRepository<Videogame, String> {

    
} 

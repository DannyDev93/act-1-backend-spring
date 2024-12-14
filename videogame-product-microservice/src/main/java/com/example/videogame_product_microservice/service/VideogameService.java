package com.example.videogame_product_microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.videogame_product_microservice.repository.VideogameRepository;
import com.example.videogame_product_microservice.repository.entity.Videogame;

@Repository
public class VideogameService {
    
    @Autowired
    VideogameRepository videogameRepository;
    public List<Videogame> getAll() {
        return (List<Videogame>) videogameRepository.findAll();
    }

    public Optional<Videogame> getById(String id) {
        return videogameRepository.findById(id);
    }

    public Videogame save(Videogame videogame) {
        return videogameRepository.save(videogame);
    }

    public String delete(String id) {
        videogameRepository.deleteById(id);

        return "Videogame deleted!";
    }

}

package com.example.videogame_product_microservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.videogame_product_microservice.repository.entity.Videogame;
import com.example.videogame_product_microservice.service.VideogameService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/videogame")
public class VideogameController {
    @Autowired
    VideogameService videogameService;

    // Get all videogames
    @GetMapping()
    public List<Videogame> getAll() {
        return videogameService.getAll();
    }

    // Get videogame by id
    @GetMapping("{id}")
    public Optional<Videogame> getAll(@PathVariable(name = "id") String id) {
        return videogameService.getById(id);
    }

    // Create videogame
    @PostMapping
    public Videogame saveVideogame(@Valid @RequestBody Videogame videogame) {
       return videogameService.save(videogame);
    }

    // Update videogame
    @PutMapping
    public Videogame updateVideogame(@RequestBody Videogame videogame) {
       return videogameService.save(videogame);
    }

    // Delete videogame
    @DeleteMapping("{id}")
    public String deleteVideogame(@PathVariable(name = "id") String id) {
        return videogameService.delete(id);
    }
    
}
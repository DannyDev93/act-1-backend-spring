package com.example.videogame_review_microservice.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.videogame_review_microservice.repository.entity.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, String> {
    
} 

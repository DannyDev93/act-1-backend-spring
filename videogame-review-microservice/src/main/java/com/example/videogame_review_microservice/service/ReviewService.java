package com.example.videogame_review_microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.videogame_review_microservice.repository.ReviewRepository;
import com.example.videogame_review_microservice.repository.entity.Review;



@Repository
public class ReviewService {
    
    @Autowired
    ReviewRepository reviewRepository;
    public List<Review> getAll() {
        return (List<Review>) reviewRepository.findAll();
    }

    public Optional<Review> getById(String id) {
        return reviewRepository.findById(id);
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public String delete(String id) {
        reviewRepository.deleteById(id);

        return "Review deleted!";
    }

}

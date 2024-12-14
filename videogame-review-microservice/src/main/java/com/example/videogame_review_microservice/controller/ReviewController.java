package com.example.videogame_review_microservice.controller;
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

import com.example.videogame_review_microservice.repository.entity.Review;
import com.example.videogame_review_microservice.service.ReviewService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    // Get all reviews
    @GetMapping()
    public List<Review> getAll() {
        return reviewService.getAll();
    }

    // Get review by id
    @GetMapping("{id}")
    public Optional<Review> getAll(@PathVariable(name = "id") String id) {
        return reviewService.getById(id);
    }

    // Create review
    @PostMapping
    public Review saveReview(@Valid @RequestBody Review review) {
       return reviewService.save(review);
    }

    // Update review
    @PutMapping
    public Review updateReview(@RequestBody Review review) {
       return reviewService.save(review);
    }

    // Delete review
    @DeleteMapping("{id}")
    public String deleteReview(@PathVariable(name = "id") String id) {
        return reviewService.delete(id);
    }
    
}
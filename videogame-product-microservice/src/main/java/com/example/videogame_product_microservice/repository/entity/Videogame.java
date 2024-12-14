package com.example.videogame_product_microservice.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public String id;

    @NotNull(message = "Videogame name is required")
    public String name;
    public Integer price;
    public String genre;
    public String platform;
    public Integer year;
}

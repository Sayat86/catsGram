package com.example.catsgramapplication.model;

import lombok.Data;

import java.time.Instant;
@Data
public class Post {
    private Integer id;
    private final String author;
    private final Instant creationDate = Instant.now();
    private String description;
    private String photoUrl;
}

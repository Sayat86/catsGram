package com.example.catsgramapplication.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private String email;
    private String nickname;
    private LocalDate birthdate;
}

package com.example.catsgramapplication.berlinAge23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task1")
public class Task1UserController {
    List<UserBerlin> users = new ArrayList<>() {{
        add(new UserBerlin("David", 25, "London"));
        add(new UserBerlin("Alice", 30, "Paris"));
        add(new UserBerlin("John", 22, "New York"));
        add(new UserBerlin("Maria", 25, "Madrid"));
        add(new UserBerlin("Alex", 35, "Berlin"));
        add(new UserBerlin("Sophie", 28, "Paris"));
        add(new UserBerlin("Michael", 30, "New York"));
        add(new UserBerlin("Emma", 40, "Rome"));
        add(new UserBerlin("Thomas", 22, "Berlin"));
        add(new UserBerlin("Olivia", 33, "London"));
        add(new UserBerlin("Christopher", 28, "London"));
        add(new UserBerlin("Emily", 32, "Paris"));
        add(new UserBerlin("William", 26, "New York"));
        add(new UserBerlin("Isabella", 29, "Madrid"));
        add(new UserBerlin("Ethan", 31, "Berlin"));
        add(new UserBerlin("Ava", 24, "London"));
        add(new UserBerlin("James", 36, "Paris"));
        add(new UserBerlin("Sophia", 27, "New York"));
        add(new UserBerlin("Daniel", 34, "Madrid"));
        add(new UserBerlin("Mia", 23, "Berlin"));
        add(new UserBerlin("Benjamin", 30, "Rome"));
        add(new UserBerlin("Charlotte", 26, "London"));
        add(new UserBerlin("Henry", 32, "Paris"));
        add(new UserBerlin("Evelyn", 25, "New York"));
    }};
    //   /task1/users?city=Berlin&age=23
    //   /task1/users?city=Berlin
    //   /task1/users?age=23
    //   /task1/users
    @GetMapping("/users")
    public List<UserBerlin> filterUsers(@RequestParam(required = false) String city,
                                        @RequestParam(required = false) Integer age) {
        return users.stream()
                .filter(userBerlin -> (city == null || userBerlin.getCity().equals(city))
                && (age == null || userBerlin.getAge() == age))
                .toList();
    }
}

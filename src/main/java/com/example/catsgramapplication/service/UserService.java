package com.example.catsgramapplication.service;

import com.example.catsgramapplication.exception.InvalidEmailException;
import com.example.catsgramapplication.exception.UserAlreadyExistException;
import com.example.catsgramapplication.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class UserService {
    private final Map<String, User> users = new HashMap<>();

    public Collection<User> findAll() {
        return users.values();
    }

    public User create(User user) {
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new InvalidEmailException("Почта пользователя не может быть пустой");
        }
        if (users.containsKey(user.getEmail())) {
            throw new UserAlreadyExistException("Пользователь с такой почтой уже существует");
        }
        users.put(user.getEmail(), user);
        return user;
    }

    public User update(User user) {
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new InvalidEmailException("Почта пользователя не может быть пустой");
        }
        users.put(user.getEmail(), user);
        return user;
    }

    public User findUserByEmail(String email) {
        for (User user : users.values())
            if (user.getEmail().equals(email)) {
                return user;
            }
        return null;
    }
}

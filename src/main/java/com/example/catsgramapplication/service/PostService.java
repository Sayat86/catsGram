package com.example.catsgramapplication.service;

import com.example.catsgramapplication.exception.UserNotFoundException;
import com.example.catsgramapplication.model.Post;
import com.example.catsgramapplication.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class PostService {
    private final UserService userService;
    private final List<Post> posts = new ArrayList<>();
    int uniqueId = 1;

    public List<Post> findAll() {
        return posts;
    }

    public Post create(Post post) {
        User postAuthor = userService.findUserByEmail(post.getAuthor());
        if (postAuthor == null) {
            throw new UserNotFoundException(String.format(
                    "Пользователь %s не найден",
                    post.getAuthor()));
        }
        post.setId(uniqueId++);
        posts.add(post);
        return post;
    }

    public Post findById(int postId) {
        for (Post post : posts) {
            if (post.getId() == postId) {
                return post;
            }
        }
        return null;
    }
}

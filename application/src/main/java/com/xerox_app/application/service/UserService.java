package com.xerox_app.application.service;
import com.xerox_app.application.model.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private Map<String, User> users = new HashMap<>();

    public User createUser(User user) {
        users.put(user.getId(), user);
        return user;
    }

    public User getUser(String userId) {
        return users.get(userId);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User updateUser(String userId, User updatedUser) {
        if (users.containsKey(userId)) {
            updatedUser.setId(userId);
            users.put(userId, updatedUser);
            return updatedUser;
        }
        return null;
    }

    public boolean deleteUser(String userId) {
        return users.remove(userId) != null;
    }
}

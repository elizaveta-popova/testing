package com.example.testing;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List <User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Ivan", "ivan@mail.ru"),
                new User("Max", "max100500@inbox.ru"));
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}

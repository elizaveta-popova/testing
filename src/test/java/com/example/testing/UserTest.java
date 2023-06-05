package com.example.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private static User user1;
    private static User user2;

    @BeforeAll
    public static void createUsers () {
        user1 = new User("Ivan", "affvxayy@yandex.ru");
        user2 = new User ("","");
    }

    @Test
    void userWithParameters () {
        assertTrue(user1.getName()!= null && user1.getEmail() !=null);
    }
    @Test
    void userWithoutParameters () {
        assertTrue(user2.getName()== null && user2.getEmail() == null && user2.getName().isEmpty() && user2.getEmail().isEmpty());
    }

    @Test
    public void testNotValidUserParametersThrowException () {
        assertThrows(IllegalArgumentException.class, ()-> new User ("Kate", "hjgjg@gmail.com"));
    }

    @Test
    void shouldNotEqualNameAndEmail() {
        assertNotEquals(user1.getEmail(), user2.getName());
    }



}
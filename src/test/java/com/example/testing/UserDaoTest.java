package com.example.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    private final UserDao dao = new UserDaoImpl ();
    @Test
    public void testUserByName () {
        User user = dao.getUserByName("Ivan");

        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(),"Ivan");
    }
    @Test
    public void testUserByNameIsNull () {
        Assertions.assertNull(dao.getUserByName("Kate"));
    }

}
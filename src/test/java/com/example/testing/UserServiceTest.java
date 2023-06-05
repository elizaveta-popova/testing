package com.example.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserDao dao;

    @InjectMocks
    private UserService userService;

    @Test
    void checkIfUserExistTrue() {
        when (dao.getUserByName("test")).thenReturn(new User("test", "test@mail.ru"));

        boolean userExists = userService.checkUserExist(new User("test", "test@mail.ru"));

        verify (dao, times(1)).getUserByName("test");
        assertTrue(userExists);
    }

    @Test
    void checkIfUserExistFalse() {
        boolean userExists = userService.checkUserExist(new User ("test", "test@mail.ru"));
        assertFalse(userExists);
    }
}
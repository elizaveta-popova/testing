package com.example.testing;

public class User {
    private String name;
    private String email;
    private static String char1 = "@";
    private static String char2 = ".";

    public User(String name, String email) {
        validateUserParameters(name, email);
        this.name = name;
        this.email = email;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private void validateName (String name) {
        if (name == null) {
            throw new IllegalArgumentException("Неверное имя пользователя");
        }
    }
    public void validateEmail (String email) {
        if (email == null || !email.contains(char1) || !email.contains(char2)) {
            throw new IllegalArgumentException("Неверная почта");
        }
    }
    public void validateUserParameters (String name, String email) {
        validateEmail(email);
        validateName(name);
        if (name.equals(email)) {
            throw new IllegalArgumentException ("Почта не должна быть такой же, как и логин");
        }
    }
}

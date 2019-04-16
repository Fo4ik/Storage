package com.zinkovsky;

public class User {
    public String name;
    public int age;
    public int id;

    public User(int userId, String name, int age) {
    }

    public User(String alex, int i) {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

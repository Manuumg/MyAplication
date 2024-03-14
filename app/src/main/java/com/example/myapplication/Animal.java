package com.example.myapplication;

public class Animal {
    private String urlImage;
    private String type;
    private String name;
    private int age;


    public Animal(String urlImage, String type, String name, int age) {
        this.urlImage = urlImage;
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

package com.aminhadad;

import com.github.javafaker.Faker;

public class Main {

    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().name());
        System.out.println(faker.address().city());
    }
}

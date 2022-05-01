package com.company;

public class ProductManager {
    public static void add(Pruduct pruduct) {
        //PruductValidator validator = new PruductValidator();
        if (PruductValidator.isValid(pruduct)) {
            System.out.println("Eklendi");
        }else {
            System.out.println("Eklenemedi");
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 32;
        int sayi2 = 32;
        int sayi3 = 32;

        if (sayi1 < sayi2) {
            if (sayi2 < sayi3) {
                System.out.println("en büyük sayi :" + sayi3);
            } else {
                System.out.println("en büyük sayi :" + sayi2);
            }
        }
        if (sayi2 < sayi1) {
            if (sayi1 < sayi3) {
                System.out.println("en büyük sayi :" + sayi3);
            } else {
                System.out.println("en büyük sayi :" + sayi1);
            }
        }

    }
}

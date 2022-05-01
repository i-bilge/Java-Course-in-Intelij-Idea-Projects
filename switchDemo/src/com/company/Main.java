package com.company;

public class Main {

    public static void main(String[] args) {
        int grade = 100;
        switch (grade) {
            case 100:
                System.out.println("A ile gectiniz");
                break;
            //bir sürü case yazabilirsin

            // en sona da default eklenir baska bir girdi olursa diye.
            default:
                System.out.println("gecersiz not girdiniz!");
        }
    }
}

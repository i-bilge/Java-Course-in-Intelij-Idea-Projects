package com.company;

public class Main {

    public static void main(String[] args) {
	int number = 6;
    int number2 = 0;
        for (int i=1; i<number; i++){
            if (number % i == 0){
                number2 = number2 + i;
            }
        }
        if (number2 == number){
            System.out.println("mükemmel sayi");
        }
        else System.out.println("mükemmel degil");
    }
}

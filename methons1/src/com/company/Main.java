package com.company;
import java.util.Scanner;

public class Main {
static boolean isPrime(int n) {
    for (int i = 2; i < (n / 2); i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}
static int findGCD(int x,int y){
    while (x!=y){
        if (x>y) x=x-y;
        else y=y-x;
    }
    return x;
}

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//
//        System.out.println(isPrime(n));
//--------------------------------------------------
        System.out.println(findGCD(25,15));
    }
}

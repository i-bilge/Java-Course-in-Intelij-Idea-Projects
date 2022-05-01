package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the differans :");
        int d = sc.nextInt();
        System.out.println("Enter how many times do you want :");
        int n = sc.nextInt();

        int i=0;
        while (i<=n){
            System.out.print(a+",");
            a=a+d;
            i++;
        }

    }
}

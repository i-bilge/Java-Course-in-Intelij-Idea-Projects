package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//
//        String num;
//
//        System.out.println("Enter a number : ");
//        num = sc.nextLine();
//
//        if (num.matches("[01]+")){
//            System.out.println("Bianry Radix=2");
//        }
//        else {
//            if (num.matches("[0-7]+")){
//                System.out.println("Octal Radix=8");
//            }
//            else if (num.matches("[0-9]+")){
//                System.out.println("Decimal Radix=10");
//            }
//            else if (num.matches("[0-9A-F]+")){
//                System.out.println("Hexa Radix=16");
//            }
//            else {
//                System.out.println("It is not a number!");
//            }
//        }
//--------------------------------1----------------------------------
        //A year is 365.24219 days.
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the year :");
        int year=sc.nextInt();

        if (year%4==0){
            if (year%100==0) {
                if (year%400==0){
                    System.out.println("it is a Leapyear");
                }
                else {
                    System.out.println("it is not a Leapyear");
                }
            }
            else {
                System.out.println("it is a Leapyear");
            }

        }
        else {
            System.out.println("it is not a Leapyear");
        }

    }
}

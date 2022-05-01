package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int a=5, b=10, c=15;
//        if (a>b && a>c){
//            System.out.println(a);
//        }
//        else if (b>c){
//            System.out.println(b);
//        }
//        else {
//            System.out.println(c);
//        }
//---------------------------1----------------------------------------
//    Scanner input = new Scanner(System.in);
//    System.out.println("Please write the number: ");
//    int number = input.nextInt();
//
//    if (number%2 == 0){
//        System.out.println("It is even");
//    }
//    else {
//        System.out.println("It is odd");
//    }
//----------------------------2----------------------------------------

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please write your age :");
//        int age = sc.nextInt();
//
//        if (age>=14 && age<=55){
//            System.out.println("you are young!");
//        }
//        else {
//            System.out.println("Maybe you are so experienced or younger:)");
//        }
//----------------------------3-----------------------------------------

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please give your notes :");
        int n1 = sc1.nextInt();
        int n2 = sc1.nextInt();
        int n3 = sc1.nextInt();
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Please give your second note :");
//        int n2 = sc2.nextInt();
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Please give your third note :");
//        int n3 = sc3.nextInt();

        int total=n1+n2+n3;
        int average=total/3;

        if (average>=70){
            System.out.println("A");
        }
        else if (average>=60 && average<70){
            System.out.println("B");
        }
        else if (average>=50 && average<60){
            System.out.println("C");
        }
        else if (average>=40 && average<50){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}

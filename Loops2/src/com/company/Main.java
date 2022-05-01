package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("give me your X :");
//        int x=sc.nextInt();
//
//        for (int i=1;i<=10;i++){
//            System.out.println(x+"*"+i+"= "+(x*i));
//        }
//-----------------------------1-----------------------------------

//        int sum=0;
//        for (int i=1;i<=10;i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);
//------------------------------2-----------------------------------

       Scanner sc = new Scanner(System.in);
       System.out.println("give me your n :");
       int n=sc.nextInt();
       int fac=1;

       for (int i=1; i<=n;i++){
           fac = fac*i;
       }
       System.out.println(n+"! = "+fac);

    }
}

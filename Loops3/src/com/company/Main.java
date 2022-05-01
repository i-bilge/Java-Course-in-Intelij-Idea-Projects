package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
//        int count =0;
//
//        while (n>0){
//            n=n/10;
//            count++;
//        }
//        System.out.println("It is "+count+" digit.");
//---------------------------------1------------------------------------

        int m=n;
        int r=0;
//        int rev=0;
        String str="";


        while (n>0){
            r=n%10;
//            rev = rev*10+r;
            n=n/10;
            str = str+r;
        }
//        if (m==rev){
//            System.out.println("Its a plindrome");
//        }
//        else {
//            System.out.println("Its not a plindrome");
//        }
//---------------------------------2-----------------------------------

        char c;
        for (int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);

            switch (c){
                case '0': System.out.println("Zero ");
                    break;
                case '1': System.out.println("One ");
                    break;
                case '2': System.out.println("Two ");
                    break;
                case '3': System.out.println("Three ");
                    break;
                case '4': System.out.println("Four ");
                    break;
                case '5': System.out.println("Five ");
                    break;
                case '6': System.out.println("Six ");
                    break;
                case '7': System.out.println("Seven ");
                    break;
                case '8': System.out.println("Eight ");
                    break;
                case '9': System.out.println("Nine ");
                    break;
            }
        }


    }
}

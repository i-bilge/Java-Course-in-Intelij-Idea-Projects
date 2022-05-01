package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.awt.desktop.SystemEventListener;
import java.lang.runtime.SwitchBootstraps;

  public class Main {

      public static void main(String[] args) {
//	    int day=8;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6, 7:
//                System.out.println("Its weekend");
//                break;
//
//            default:
//                System.out.println("irrelevant number");
//                break;
//        }
// for example it is so useful for menu options. int, char and String scitch ile calisir.
//---------------------------------1----------------------------------

//        String domain = "google.org";
//        String ext = domain.substring(domain.indexOf(".")+1);
//
//        switch (ext){
//            case "com": System.out.println("Commercial");
//            break;
//            case "org": System.out.println("Organization");
//            break;
//            case "net": System.out.println("Network");
//            break;
//
//            default: System.out.println("unknown");
//            break;
//        }
//-----------------------2---------------------------------------------

        Scanner sc=new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 numbers :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option in Words");
        String option=sc.nextLine();

        option=option.toUpperCase();

        switch (option){
            case "ADD": System.out.println("Sum is "+(x+y));
                break;

            case "SUB": System.out.println("Sum is "+(x-y));
                break;

            case "MUL": System.out.println("Sum is "+(x*y));
                break;

            case "DIV": System.out.println("Sum is "+(x/y));
                break;

            default: System.out.println("Invalid Option");
                break;
        }

    }
}

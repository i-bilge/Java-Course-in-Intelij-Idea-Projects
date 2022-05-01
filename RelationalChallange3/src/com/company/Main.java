package com.company;
import javax.swing.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Write please the day number :");
//        int day = sc.nextInt();
//
//        if (day==1){
//            System.out.println("Today is monday");
//        }
//        else if (day==2){
//            System.out.println("Today is tuesday");
//        }
//        else if (day==3){
//            System.out.println("Today is wednesday");
//        }
//        else if (day==4){
//            System.out.println("Today is thursday");
//        }
//        else if (day==5){
//            System.out.println("Today is friday:)");
//        }
//        else if (day==6){
//            System.out.println("At last its weekend!");
//        }
//        else if (day==7){
//            System.out.println("Its still weekend...");
//        }
//        else {
//            System.out.println("Invalid number");
//        }
//---------------------------------1---------------------------------

        String url=("http://www.gooogle.com");
        String protokol, type;
        int p,t;

        p = url.indexOf(":");
        t = url.lastIndexOf(".");

        protokol = url.substring(0,p);
        type = url.substring((t+1));

       if (protokol.equals("http")) {
           System.out.println("Hyper Text Transfer Protocol");
       }
       else {
           if (protokol.equals("ftp")){
               System.out.println("File Transfer Protocol");
           }
           else {
               System.out.println("unknown protocol");
           }
       }
       if (type.equals("com")) {
           System.out.println("Commercial");
       }
       else {
           if (type.equals("org")){
           System.out.println("Organization");
           }
        else if (type.equals("net")){
          System.out.println("Network");
        }
        else {
            System.out.println("unknown type");
        }
       }

    }
}

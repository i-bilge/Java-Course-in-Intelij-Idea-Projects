package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       int A[]= {3,9,7,8,12,15,4,6,5,10};

//       int key=6;
//       for (int i=0;i<A.length;i++){
//          if (A[i]==6) {
//              System.out.println(i);
//              System.exit(0);
//          }
//
//       }
//       System.out.println("Not found!");
//---------------------1-----------------------------
        int max1,max2;
        max1=max2=A[0];


       for (int i=0;i<A.length;i++){
           if (A[i]>max1){
               max2=max1;
               max1=A[i];
           }
       }
       System.out.println("Maximum number is "+max1);
       System.out.println("Second largest number is "+max2);
    }
}

package com.company;

import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
        String str1="Java Program";
        String str2= new String("JAVA");

         char c[]={'H','e','l','l','o'};
         String str3=new String(c);

         byte b[]={65,66,67,68};
         String str4=new String(b,1,3);

        System.out.println(str4);

//new yazip olusturunca Heap ta yeni bir hücre olusturur. onu String iceriginin oldugu Poola atar.
        //Strings are immutable

    }
}

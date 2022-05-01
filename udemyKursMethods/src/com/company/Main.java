package com.company;
import java.util.Scanner;

public class Main {
    static int max(int x,int y){
        if (x>y)
            return x;
        else
            return y;
    }
    static void update(int A[]){
        A[0]=25;
    }
    static String userName(String email){
        int a=email.indexOf('@');
        String name=email.substring(0,a);
        return name;
    }

    public static void main(String[] args) {
        int a=10,b=15;
        System.out.println(max(a,b));

        int A[]={2,3,4,5,6};
        update(A);
        System.out.println(A[0]);

        Scanner sc=new Scanner(System.in);
        System.out.println("emaili girin: ");
        String mail=sc.next();

        System.out.println(userName(mail));

    }
}

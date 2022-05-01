package com.company;

public class Main {

    public static void main(String[] args) {
	//for: 2. kisimda definition yaparsin; 2. kisimda konditionu yazarsin; 3. kisimda da yapacagi islemi yazarsin.
                //i=1 icin i<=10 ise 2ser 2ser arttir.
        for (int i=1; i<=10; i+=2){
            System.out.println(i);
        }
        System.out.println("döngü bitti.");


        //while
        int i=2;
        while (i<=10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("while döngüsü bitti.");
    }
}

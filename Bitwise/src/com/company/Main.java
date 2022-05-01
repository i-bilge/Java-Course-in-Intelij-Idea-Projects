package com.company;

public class Main {

    public static void main(String[] args) {
	// Masking and Swapping
        int a=10, b=15;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+ " "+b);

        byte x=9,y=12;

        byte z;

        z=(byte) (x<<4);
        z=(byte) (z|y);

        System.out.println(z);
        System.out.println("sum of "+20+" "+10+" :"+(10+20));
    }
}
//widening(up costing) - narrowing(down costing)

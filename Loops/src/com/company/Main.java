package com.company;

public class Main {

    public static void main(String[] args) {
	// 1.while Loop 2.do...while Loop 3. for Loop 4.for each Loop
        int i=1;
        int j=1;

        while (i<100){
            System.out.println(i);
            i=i*2;
        }
        //-----o------
        do {
            System.out.println(j);
            j=j*2;
        }while (j<100);
    }
}

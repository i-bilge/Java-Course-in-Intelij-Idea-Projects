package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi = 20;
        if (sayi<20) {
            System.out.println("sayi 20 den kücüktür.");
        }
        if (sayi < 15) {
            System.out.println("sayi 15ten de kücüktür.");
        }
        else if(sayi == 20) {
            System.out.println("sayi 20ye esittir.");
        }
        else {
            System.out.println("sayi 20 den büyüktür.");
        }
        //if kosulumuz(devamina if´ler ekleyig düzen olusturanilirsin), else diger tum sartlar icin, else if degil de söyleyse
        // veri dogru girildigi takdirde bu program her zaman calisir.
    }
}

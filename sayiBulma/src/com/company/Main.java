package com.company;

public class Main {

    public static void main(String[] args) {
	int [] sayilar = new int[]{1,2,5,7,9,0};
    int aranacak = 6;
    boolean arama = false;

    for (int sayi : sayilar) {
        if (sayi == aranacak) {
            arama = true;
            break;
        }
    }
        if (arama){
            System.out.println("sayi bulundu."); }
        else{
            System.out.println("sayi bulunamadi.");

        }
    }
}

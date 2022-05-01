package com.company;

public class Main {

    public static void main(String[] args) {
       sayiBulmaca(); //public static void olarak kodu olusturduk ve mainde sadece cagiriyoruz. tekrar yazmay gerek yok.
    }
    public static void sayiBulmaca (){ //her public static void ayri bir method, main in icinde.
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

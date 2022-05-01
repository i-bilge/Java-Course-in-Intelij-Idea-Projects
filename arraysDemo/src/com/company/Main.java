package com.company;

public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Ali";
        String ogrenci2 = "Ayse";
        String ogrenci3 = "Mehmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        // Bu sekilde tektek veri tanimlayip, veri girip, emir yazman lazim.
        // Bunun yerine bir Array([]) -dizi- olustururuz ki yeni emirler yazmayalim. döngümüz küme icerisinde devam etsin.

        String[] ogrenciler = new String[3];
        ogrenciler[0]="Ali";
        ogrenciler[1]="Ayse";
        ogrenciler[2]="Mehmet";

        for (int i=0; i< ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        // Bu for döngüdünü baska sekilde de yazabiliriz.
        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
            // Bu da ogrenciler dizisinin her bir elemanini gez demek.
        }
    }
}

package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String mesaj = "Bugün hava cok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayisi ="+ mesaj.length());
        System.out.println("5. Eleman =" + mesaj.charAt(4));
        // charAt i bir metinde belli bir dkarakterdeki degeri yakalamak icin kullaniriz.
        System.out.println(mesaj.concat(" Yasasin!"));
        // concat elimizdeki metni baska bir metinle birlestirmek icin kullanilir.
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        // statrsWith ve endsWith ile bir sey ile basliyor/bitiyor mu yu sorgulamak icin kullaniriz.
        char [] karakterler = new char [5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        //----------
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
        // indexOf bastan kacinci eleman oldugunu, lastIndexOf da sondan kacinci eleman oldugunu verir.

        String yeniMesaj = mesaj.replace(" ","-");
        System.out.println(yeniMesaj);
        //replace i baska birseyle degistirmek icin kullaniriz.
        System.out.println(mesaj.substring(2));
        // substring ile kacinci degerden baslatmak istedigimizi girer ve yazdiririz.
        System.out.println(mesaj.substring(2,5));
        // bu sekilde de 2 den baslayip 5 e kadar al emri verebiliriz.
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        // burda da split i kullanarak belirli bir degere göre(burada bosluk) metni ayirdik.
        //bunun icin for döngusunde split edip yazma emri verdik.
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        // metni kücük harfe ya da büyük harfe cevirmek icin kullanilir.
        System.out.println(mesaj.trim());
        // bunu da metnin basindaki ve sonundaki bosluklari traslamak icin kullaniriz.


    }
}

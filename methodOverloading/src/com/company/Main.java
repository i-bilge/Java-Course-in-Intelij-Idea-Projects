package com.company;

public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(3,2));
        //normal bir sekilde classtaki operasyonu baska bir class ta kullaniyorum.
        // ancak bir sure sonra denizor ki artik 3 sayiyi toplayin. yani
        // degisiklikten ziyade bir ozellik eklemek istiyorum.
        System.out.println(dortIslem.topla(2,4,5));
        // DortIslem class ina gidip ayni operasyona bir emir daha ekledim
        // ve sorunsuz calisti. buna Overloading denir.

    }
}

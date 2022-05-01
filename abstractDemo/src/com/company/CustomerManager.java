package com.company;

public class CustomerManager {
    BaseDatabaseManager databaseManager;//bu hepsini tutabilir.
    public void getCustomers(){//2-Simdi burada Oracle..da oracle.. bir new olusturup getData yi kullanirsam oracle a bagimli yaparim.
        //3-Bu noktada Strateji kullaniyorum. public classta Base..de database.. olusturuyorum. o dasabase..i getData ediyorum.
        //bu su demek:bu base sinif bizim stratejimiz oluyor. Yani ben hangi veritabani verisini verirsem onun getDatasi calisicak.
        databaseManager.getData();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        // Classlar "reference typ" tir. Deswegen new der üretiriz.
        // int sayi1=25 gibi seyler yazinca bu "value typ" olur.
        // => bizim "Stock" ve "Heap"(nesne) olarak 2 kümemiz var. new diyince stocktaki bir referanca heapte deger olusturur.
            // ama value typlerde sadece stockte bir degrolur. Heap ile bir isimiz olmaz.
        CustomerManagerCom customerManager = new CustomerManagerCom();
        // bunu yazinca bellekte bir nesne üretmis oluyoruz.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        // gördügümüz gibi bu sekilde nesneleri gruplamis olduk.
    }
}



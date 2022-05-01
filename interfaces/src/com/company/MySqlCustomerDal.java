package com.company;

public class MySqlCustomerDal implements iCustomerDal, iReposotory {//EXPLAIN: Customer: attitudelari, CustomerManager: operasyonlari, CustomerDal: veritabanlarini
    //tutan Class lara denir.
    //yazilim projelerinde katmanlar yardir. 1. ara yüz müsterinin gördügü. 2. is katmani Managerler burda 3.en arkadaki de
    //Data acsess katmani. bu katmanlar arasindak igecisler de genelde Interfacelerle yapilir ki bagimliliklar az olsun.
    @Override
    public void add() {
        System.out.println("My sql veritabanina eklendi");

    }

}
//4- Extend edecegi bir class varsa da implements in önüne extnds yazip ekleyebilirsin.
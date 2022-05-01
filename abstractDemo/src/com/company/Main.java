package com.company;

public class Main {

    public static void main(String[] args) {
	// EXAMPLE: Müsterinin veri tabanina islenmesi. Yalniz islerken farkli teknik veya veri tabanlari kullaniyor olabilirim.
        //Bu su demek; musteri oracle, SPQL veya baska bir taban kullaniyorsa da uyumlu olacak yani msterinin oracle kullanmasi sart degil
    //1-Bu tamda Abstracta uygun bir senaryo oldugu icin. Base i Abstract olusturdum, Oracle ve Sql olusturdum.
        //Ancak bu temel operasyon, simdi bunu bir yerde kullanmasi gerekiyor. bunun icin de mesela müsterileri listeleyecegim
        //bir Class acioyrum.
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();//4-custo..in datab..i Oracle dir. Baska bir musteri gelip
        //Sql derse ben sadece burayi degistirip Sql yapiyorum. Yani kod degistirmiyorum sadece Mainde configuration degistiriyorum.
        customerManager.getCustomers();
    }
}

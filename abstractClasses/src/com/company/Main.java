package com.company;

public class Main {

    public static void main(String[] args) {
	// INFO: Abstract siniflar yapisal olarak Classtir. sadece kullanim farkliliklari vardir.
        //EXAMPLE: erkek, kadin ve cocuk lar icin olan bir puanlama sistemi yazalim.
        WomenGamerCalculater womenGamerCalculater = new WomenGamerCalculater();
        womenGamerCalculater.hesapla();//1-Buraya kadar normal ögrendigimiz Inheritance. Simdi GameC.a 1 tane daha operasyon eklemek istiyorum.
        womenGamerCalculater.gameOver();
        //2-Ama hesaplama erkek, kadin veya cocuk icin ayri.Ve bunun icin 2 yöntem var. Birincisi;
        //ögrendigimiz gibi Men,Women ve Kidse gidip GameCalculatora Override edebilirim. Ikincisi;
        //Abstraction; Yani GameCalculator i Abstract isaretliyorum.

        //4-RULES:1.Abstract bir sinifin Abstract olabilmesi icin abstract imzasiyla beslenmesi gerekiyor.
                //2.Abstract bir operasyonun Abstract olabilmesi icin onun da abstract imzasiyla beslenmesi gerekiyor.
                //3.Abstract bir Class ta illa bir Abstract Op. olmak zorunda degil.
        //KULLANIM: Abstraclar newlenemez, yani tek basina kullanilamaz. Zorunlu her Classin olusturmasi gereken Op. belirleyabiliyoruz.
    }
}

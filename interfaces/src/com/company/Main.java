package com.company;

public class Main {

    public static void main(String[] args) {
	// ÖZET:Nesne yönelimli programlamanin 3 temel üyesi; Classlar, Astract Classlar ve Interfacelerdir.
    // Diger ikisinden farkli olarak Interfaceler Class kabul edilmez. Ancak Classlar gibi referans tutabilirler
    // Classlarda; Tüm operasyonlar tamamlanmis olmali
    // Abstractlarda; Kimisi dolu, kimisi bos olabilir Onu inherit eden icini doldurmali.
    // Interfacelerde ise; abstract imza olarak birakip inherit edenin doldurmasi gereken metodlar gibi bir durum vardi.
        //yani tamamlanmamis operasyonlar icerir. Abstracta 1 Claass 1 metodu implement edebilir. Ancak Interfacelerde sinir yok.
    //1-Class olustururken Java degil de Interface i sec.
      //  iCustomerDal customerDal = new OracleCustomerDal();//2-Operasyonu su kisi ayrica implemente etsin dedigim durumlarda kullaniyorum.
      CustomerManager customerManager = new CustomerManager(new OracleCustomerDal()); //SON ÖRNEK: Ben buraya ne gönderirsem o calisir.
      customerManager.Add();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(),new OgrenciKrediManager()};
        //2-Klassi actim ogrenci icin. Ancak bu diziye eklersem ona da 1,18 faiz uygulayacak.Burada devreye Overriding girer.
        for (BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.hesapla(1000));//1-Bunu yaptik. Simdi yeni talep geldi; ögrencilere kredi.
            //Yalniz ogrencilere 1,18 degil 1,10 faizden kredi vermek lazim.
        }
    }
}
//SONUC: Aksi belirtilmedigi sürece classlardaki operasyonlar overridible dir. Bunu engellemek gerekebilir, cünkü projede
// bir kisi calismiyor. bunun icin Base class ta operasyona publicten sonra "final" yazarak yapariz. Onu final operasyon yapar.
package com.company;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava cok güzel.";
        String yeniMesaj = mesaj.substring(0,2); ;
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
    // burda topla methodunu main de bir hesap makinasi olarak kullandim. artik mainde topla yazmam yeterli.
        int toplam = topla2(1,4,6,8,4);
        System.out.println(toplam);


// asagidakilerin hepsi birer void operation. __________________________________________________:operasyonu yap
        // ekle degil de bana ekledigim datai geri ver demek istersem; o artik void olmaz.return olur.__:operasyonu tekrarla
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void güncelle(){
        System.out.println("Güncellendi");

    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }//bu hesap makinasi sadece 2 sayisa izin veriyor. ama normal hesap makinalarini istedigin kadar sayi girilebilir.
    //bunun icin variable arguments kullanilir.
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

}
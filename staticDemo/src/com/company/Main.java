package com.company;

public class Main {

    public static void main(String[] args) {
	    ProductManager manager = new ProductManager();
        Pruduct pruduct = new Pruduct();
        pruduct.name = "Mouse";
        pruduct.price   = 10;
        manager.add(pruduct);
    }
}
// bu validasyon classini statik yaparsam bir arac olarak kullanabilirim. Kullan birak araclar  static yapilir.
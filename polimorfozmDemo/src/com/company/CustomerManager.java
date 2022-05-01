package com.company;

public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(String message) {
        System.out.println("Müsteri eklendi");
       // DatabaseLogger logger = new DatabaseLogger();
        //logger.Log("Log mesaji");// 3-simdi sürekli new leyerek olustirdugumuz icin bizim Base e bagimli kodlarimiz olusor.
        // "artik base degil dosyaya loglama yapacaz" dendiginde hepsini silmemiz gerekir. bu bagimliligi onlemek icin...
        // private olusturucaz yani attribute
        this.logger.log("Log mesaji");

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
//	// 1-polimorfizm cok bicimlilik demek. referans tiplerin birbirlerinin referansini tutmasi.Loglama yapicaz ornek olarak.
//        BaseLogger[] loggers = new  BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//        //2- bu sekilde istedigini ekleyip cikarabilirsin
//        for (BaseLogger logger: loggers){
//            logger.Log("Log mesaji");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}

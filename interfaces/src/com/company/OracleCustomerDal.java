package com.company;

public class OracleCustomerDal implements iCustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle veritabanina eklendi");
    }
}

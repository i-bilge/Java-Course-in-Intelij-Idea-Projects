package com.company;

public class CustomerManager  {
    private iCustomerDal customerDal;

    public CustomerManager(iCustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void Add(){
        // Is kodlari
        customerDal.add();
    }
}

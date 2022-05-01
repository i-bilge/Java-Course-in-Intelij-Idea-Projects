package com.company;

public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }//3-Biz buraya ayni operasyonu yazarsak inheritance ettigiyerdekine bunu tercih eder.Sorun da cözülmüs olur.
}

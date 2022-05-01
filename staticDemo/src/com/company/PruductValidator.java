package com.company;

public class PruductValidator {
    public static boolean isValid(Pruduct pruduct) {
        if (pruduct.price>0 && !pruduct.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void birsey (){ //Bu mesela static olmayan bir operasyon. Bunu cagirmak icin Product ´Validator u newlwmwn lazim.

    }
}

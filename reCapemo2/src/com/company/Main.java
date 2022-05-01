package com.company;

public class Main {

    public static void main(String[] args) {
	   // double[] mylist = new double[4]; böyle yazip altina doublelari tanimlamakla süslü parantez icinde direkt
       //elemanlari yazmak arasinda bir fak yok.
        double[] mylist = {1.2,1.3,4.3,5.6};
        double total=0;
        double max=mylist[0];

        for (double number:mylist) {
            total = total+number;
            if (max<number) {
                max = number;
            }
            System.out.println(number);
        }
            System.out.println("Toplam ="+total);
            System.out.println("En büyük sayi ="+max);

    }
}

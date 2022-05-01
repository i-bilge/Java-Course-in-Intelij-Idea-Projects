package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 23;
        int remainder =number % 2 ;
        // % operatörü mod demek: %2 mod 2 ne demek yani 2 ye bölümünden kalan.
        System.out.println(remainder);
    //-------------------------------------------------------------------------------------
        boolean isPrime = true; //boolean i bir varsayim yaratmak icin kullaniriz.
        if (number < 2) {
            System.out.println("It is not prime or not a relevant number.");
            return; // bu kod da public statik voide döner, yani burda bitiri. yoksa hem bunu yazar hem de for a girip onu yazar.
                        }
        for (int i=2; i<number;i++ ){
            if (number % i == 0){
                isPrime = false;
            }   }
            if (isPrime){
                System.out.println("it is prime.");
            }
            else {
                System.out.println("it is not prime.");
            }

        }
    }


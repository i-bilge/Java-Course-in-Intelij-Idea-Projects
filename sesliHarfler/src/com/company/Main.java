package com.company;

public class Main {

    public static void main(String[] args) {
	String harf = "Al"; //buranin harf olmasi yani chart olmasi lazim ama `´ yapamadim.

        switch (harf) {
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println("Kalin sesli harf");
                break;
            default:
                System.out.println("Ince harf");

        }

    }
}

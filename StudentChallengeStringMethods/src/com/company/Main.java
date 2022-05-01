package com.company;

public class Main {

    public static void main(String[] args) {
	    String str = "programmer@gmail.com";
        //1. Find if the email id id on gmail?

        //str nin @ den donra geleni gmail mi
        int i = str.indexOf('@');
        String uName = str.substring(0,i);
        String domain = str.substring(i+1, str.length());

        System.out.println("User name :"+uName);
        System.out.println("Domain name :"+domain);
        System.out.println(domain.startsWith("gmail"));




    }
}

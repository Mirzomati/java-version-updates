package com.cydeo;

public class Main {

    public static void main(String[] args) {

        System.out.println("how to access a constant");

        Currrency c = Currrency.PENNY;
        System.out.println(c);
        System.out.println(Currrency.DIME);


        System.out.println("how to get all constant");
        Currrency[] currrencies = Currrency.values();


        System.out.println("How to use enums with switch");

        switch (Currrency.PENNY){
            case PENNY:
                System.out.println("it is 1 cent");
                break;
            case NICKLE:
                System.out.println("it is 5 cent");
                break;
            case  DIME:
                System.out.println(" is 10 cent");
                break;
            case QUARTER:
                System.out.println(" is 25");
                break;

        }


        System.out.println(Currrency.DIME.getValue());
        System.out.println(Currrency.DIME.ordinal()); ///shows index

    }


}

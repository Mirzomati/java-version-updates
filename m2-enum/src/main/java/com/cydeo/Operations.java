package com.cydeo;

public enum Operations {

    PLUS,MINUS,DIVIDE,MULTIPLY; //each constant is object(new) of operation


    private Operations(){ //always private
        System.out.println("Constructor");
    }
}

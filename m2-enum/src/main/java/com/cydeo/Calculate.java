package com.cydeo;

import static com.cydeo.Operations.DIVIDE;
import static com.cydeo.Operations.MINUS;

public class Calculate {

    public static void main(String[] args) {

        calculate(DIVIDE, 10, 5);


    }

    public static void calculate(Operations operations, int num1, int num2){

        switch (operations){
            case PLUS:
                System.out.println(num1 + num2);
                break;
            case MINUS:
                System.out.println(num1 - num2);
                break;
            case DIVIDE:
                System.out.println(num1 / num2);
                break;
            case MULTIPLY:
                System.out.println(num1 * num2);
                break;
        }

    }
}

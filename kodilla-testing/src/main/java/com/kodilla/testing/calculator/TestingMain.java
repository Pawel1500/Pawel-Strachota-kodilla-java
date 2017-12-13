package com.kodilla.testing.calculator;

public class TestingMain  {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator(1,1);

        int result = calculator.getAdd();

        if (result==2){
            System.out.println("test metoda add OK");
        } else {
            System.out.println("Error! metoda add");
        }

        result = calculator.getSubtract();

        if (result==0){
            System.out.println("test metoda subtract OK");
        } else {
            System.out.println("Error! metoda subtract");
        }
    }
}


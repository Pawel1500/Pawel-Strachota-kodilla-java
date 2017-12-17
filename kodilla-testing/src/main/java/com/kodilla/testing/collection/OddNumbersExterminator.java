package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import java.io.*;


public class OddNumbersExterminator {

    public ArrayList exterminator() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();


        for (Integer i = 0; i < 100; i++) {
             numbers.add(i,i);


            if (numbers.get(i)%2==0) {
                int num = numbers.get(i);
                System.out.println(num);
            }
        }

        return numbers;
    }



}


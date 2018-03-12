package com.kodilla.testing.collection;
import java.util.ArrayList;



public class OddNumbersExterminator {



    public void exterminate()
    {
        ArrayList numbers = new ArrayList();
        System.out.println(numbers);


        for (Integer i = 0; i < 100; i++) {



            if (i % 2 == 0) {
                numbers.add(i);

                numbers.get(i);
                System.out.println(numbers);
            }
        }


    }



}


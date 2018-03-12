package com.kodilla.testing.collection;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    private static int testCounter = 0;
    private boolean aBoolean;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList test = new ArrayList();

        System.out.println(test);

        if(test.isEmpty())

        {
            System.out.println("Test OK");
        }
        else
        {
            System.out.println("Test False");
        }



    }

    @Test
    public void testOddNumbersExterminatorNormalList() {


        ArrayList test = new ArrayList();


        System.out.println(test);

        for (int i = 0; i < 100; i++) {
            test.add(i);

        }

        if (test.size() == 100) {

            System.out.println("Test OK");

        } else {
            System.out.println("Test Fail");
        }
    }
}


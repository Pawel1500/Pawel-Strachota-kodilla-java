package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

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
    public void addFigure() {
//given
        ArrayList<String> numbers = new ArrayList<String>();
//
//        int i;
//        for (i = 0; i < 3; i++) //usunac
//            if (i % 3 == 0) {
        //when
                numbers.add(Circle.getNameCircle());
//            } else if (i % 3 == 1) {

                numbers.add(Square.getNameSquare());
 //           } else if (i % 3 == 2) {

                numbers.add(Triangle.getNameTriangle());
 //           }
 //       Integer large = 3;
        //then
        Assert.assertEquals(3, numbers.size());
  //      if (numbers.size() == large) {
  // /         System.out.println("Test OK");
  //      } else {
  //          System.out.println("Test False");
  //      }
    }

    @Test
    public void removeFigure() {


//given
        ArrayList<String> numbers = new ArrayList<String>();


        int i;
        for (i = 0; i < 3; i++)
            if (i % 3 == 0) {
                numbers.add(Circle.getNameCircle());
            } else if (i % 3 == 1) {

                numbers.add(Square.getNameSquare());
            } else if (i % 3 == 2) {

                numbers.add(Triangle.getNameTriangle());
            }
//when
        numbers.remove("Triangle");
//then
    Assert.assertEquals(i - 1, numbers.size());
        if (numbers.size() < i) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test False");
        }
    }

    @Test
    public void getFigure() {


//given
        ArrayList<String> numbers = new ArrayList<String>();




        int i;
        for (i = 0; i < 3; i++)
            if (i % 3 == 0) {
                numbers.add(Circle.getNameCircle());
            } else if (i % 3 == 1) {

                numbers.add(Square.getNameSquare());
            } else if (i % 3 == 2) {

                numbers.add(Triangle.getNameTriangle());
            }

        String name = "Triangle";
//when
        String actual = numbers.get(2);
//then
        Assert.assertEquals(name, actual);
        if (numbers.get(2) == name) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test False");
        }
    }

    @Test
    public void showFigure() {

        //when
        Square.getPoleSquare();
        //noExceptionThrown

        //if (true) {
        //   System.out.println("Test OK");
        //} else {
        //    System.out.println("Test False");
       //}
    }


}



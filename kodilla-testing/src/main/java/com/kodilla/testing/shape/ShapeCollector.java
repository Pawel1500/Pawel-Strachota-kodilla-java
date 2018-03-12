package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private int i;
    private boolean state;


    ArrayList<String> numbers = new ArrayList<String>();



    public void addFigure(Shape shape) {

        for (i = 0; i < 100; i++)
            if (i % 3 == 0) {

            numbers.add(Circle.getNameCircle());
            }

        else if (i % 3 == 1) {

            numbers.add(Square.getNameSquare());
        }
        else if (i % 3 == 2) {

            numbers.add(Triangle.getNameTriangle());
        }
    }
    public void removeFigure(Shape shape)
    {
        i=0;
        numbers.remove(i);

    }

    public void getFigure(int i)
    {
        i=0;
       numbers.get(i);

    }

    public void showFigures()
    {
        Square.getPoleSquare();

    }
}

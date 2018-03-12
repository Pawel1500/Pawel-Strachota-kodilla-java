package com.kodilla.testing.shape;

public class Square implements Shape {
    private static double aSquare;
    private static double poleSquare;
    private static String nameSquare = "Square";

    public Square(double aSquare, double poleSquare, String nameSquare) {
        this.aSquare = aSquare;
        this.poleSquare = poleSquare;
        this.nameSquare = nameSquare;
    }

    public double getaSquare() {
        return aSquare;
    }

    public static double getPoleSquare() {
        return poleSquare = aSquare*aSquare;
    }

    public static String getNameSquare() {
        return nameSquare;
    }

    @Override
    public void getShapeName() {
         System.out.print(getNameSquare());
    }

    @Override
    public void getField() {
           System.out.print("Pole Square =" + getPoleSquare());

    }
}

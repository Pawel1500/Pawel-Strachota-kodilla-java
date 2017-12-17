package com.kodilla.testing.shape;

public class Square implements Shape {
    double aSquare;
    double poleSquare;
    private String nameSquare = "Square";

    public Square(double aSquare, double poleSquare, String nameSquare) {
        this.aSquare = aSquare;
        this.poleSquare = poleSquare;
        this.nameSquare = nameSquare;
    }

    public double getaSquare() {
        return aSquare;
    }

    public double getPoleSquare() {
        return poleSquare = aSquare*aSquare;
    }

    public String getNameSquare() {
        return nameSquare;
    }

    @Override
    public void getShapeName() {
         System.out.print(getNameSquare());
    }

    @Override
    public void getField() {
           System.out.print("Pole Square =" + poleSquare);

    }
}

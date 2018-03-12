package com.kodilla.testing.shape;

public class Circle implements Shape {
    private  double rCircle;
    private double poleCircle;
    private static String nameCircle = "Circle";

    public Circle(double rCircle, double poleCircle, String nameCircle) {
        this.rCircle = rCircle;
        this.poleCircle = poleCircle;
        this.nameCircle = nameCircle;
    }

    public double getrCircle() {
        return rCircle;
    }

    public double getPoleCircle() {

        return poleCircle = rCircle*rCircle*3.14;
    }

    public static String getNameCircle() {
        return nameCircle;
    }

    @Override
    public void getShapeName() {
        System.out.print(getNameCircle());
    }

    @Override
    public void getField(){
        System.out.print("Pole Circle ="+ poleCircle);

    }


}

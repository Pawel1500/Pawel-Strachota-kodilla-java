package com.kodilla.testing.shape;

public class Triangle implements  Shape {

    double aTriangle;
    double bTriangle;
    double poleTriangle;
    private static String nameTriangle = "Triangle";


    public Triangle(double aTriangle, double bTriangle, double poleTriangle, String nameTrangle) {
        this.aTriangle = aTriangle;
        this.bTriangle = bTriangle;
        this.poleTriangle = poleTriangle;
        this.nameTriangle = nameTrangle;
    }

    public double getaTriangle() {
        return aTriangle;
    }

    public double getbTriangle() {
        return bTriangle;
    }

    public double getPoleTriangle() {
        return poleTriangle = aTriangle*bTriangle*0.5;
    }

    public static String getNameTriangle() {
        return nameTriangle;
    }

    @Override

    public void getShapeName() {
        System.out.print(getNameTriangle());
    }

    @Override
    public void getField(){
        System.out.print("Pole Triangle ="+ poleTriangle);

    }
}

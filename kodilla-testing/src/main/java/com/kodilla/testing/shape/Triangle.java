package com.kodilla.testing.shape;

public class Triangle implements  Shape {

    double aTriangle;
    double bTriangle;
    double poleTriangle;
    private String nameTrangle = "Triangle";


    public Triangle(double aTriangle, double bTriangle, double poleTriangle, String nameTrangle) {
        this.aTriangle = aTriangle;
        this.bTriangle = bTriangle;
        this.poleTriangle = poleTriangle;
        this.nameTrangle = nameTrangle;
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

    public String getNameTrangle() {
        return nameTrangle;
    }

    @Override

    public void getShapeName() {
        System.out.print(getNameTrangle());
    }

    @Override
    public void getField(){
        System.out.print("Pole Triangle ="+ poleTriangle);

    }
}

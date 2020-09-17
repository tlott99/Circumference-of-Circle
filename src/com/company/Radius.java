package com.company;

public class Radius {
    private int radius = 0;
    private double circumference = 0;
    public Radius(int r){
         this.radius = r;

    }
    public double getCircumference(){
        double π = 3.14;
        double circumference = radius*2*π;
        return circumference;
    }
}

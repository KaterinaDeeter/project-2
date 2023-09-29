package com.csc205.project2;

public class Cube extends Shape {
    private double width;

    public Cube()
    {
        width = 0.0;
    }
    public Cube(double Width)
    {
        width = Width;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double Width)
    {
        width = Width;
    }

    public double surfaceArea()
    {
        double surfaceArea = 6.0 * Math.pow(width, 2.0);
        return surfaceArea;
    }

    public double volume()
    {
        double volume = Math.pow(width, 3.0);
        return volume;
    }

    @Override
    public String toString() {
        return "Cube {Edge Length (Width): " + width + ", Volume: " + volume() + ", Surface Area: " + surfaceArea();
    }

}

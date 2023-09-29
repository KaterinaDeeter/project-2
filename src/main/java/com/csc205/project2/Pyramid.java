package com.csc205.project2;

public class Pyramid extends Shape{
    private double length;
    private double width;
    private double height;

    public Pyramid()
    {
        length = 0.0;
        width = 0.0;
        height = 0.0;
    }
    public Pyramid(double Length, double Width, double Height)
    {
        length = Length;
        width = Width;
        height = Height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double Length) {
        length = Length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double Width) {
        width = Width;
    }
    public double getHeight() {
        return height;
    }

    public void setLHeight(double Height) {
        height = Height;
    }

    public double surfaceArea()
    {
        double surfaceArea = (length * width) + (length * Math.sqrt((Math.pow((width/2.0), 2.0)) + Math.pow(height, 2.0))) + (width * Math.sqrt((Math.pow((length/2.0), 2.0)) +  Math.pow(height, 2.0)));
        return surfaceArea;
    }

    public double volume()
    {
        double volume = (((length * width) * height))/3;
        return volume;
    }

    @Override
    public String toString() {
        return "Pyramid {Length: " + length+ ", Width: " + width + ", Height: " + height + ", Volume: " + volume() + ", Surface Area: " + surfaceArea();
    }
}

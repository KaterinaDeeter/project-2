package com.csc205.project2;
import java.math.*;
//This class was created by CHATGPT with the following prompt: create a class in java that extends shape for a triangular prism and provides getters and setters,  the volume and the surface area using three sides and height"

public class TriangularPrism extends Shape{
        private double sideA;
        private double sideB;
        private double sideC;
        private double height;

        // Constructor
        public TriangularPrism(double sideA, double sideB, double sideC, double height) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.height = height;
        }

        // Getter and Setter methods
        public double getSideA() {
            return sideA;
        }

        public void setSideA(double sideA) {
            this.sideA = sideA;
        }

        public double getSideB() {
            return sideB;
        }

        public void setSideB(double sideB) {
            this.sideB = sideB;
        }

        public double getSideC() {
            return sideC;
        }

        public void setSideC(double sideC) {
            this.sideC = sideC;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        // Method to calculate the volume of the triangular prism
        public double volume() {
            double baseArea = calculateBaseArea();
            return baseArea * height;
        }

        // Method to calculate the surface area of the triangular prism
        public double surfaceArea() {
            double basePerimeter = sideA + sideB + sideC;
            double baseArea = calculateBaseArea();
            double lateralArea = basePerimeter * height;
            double totalSurfaceArea = (2 * baseArea) + lateralArea;
            return totalSurfaceArea;
        }

        // Helper method to calculate the area of the base triangle using Heron's formula
        private double calculateBaseArea() {
            double s = (sideA + sideB + sideC) / 2;
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }

    @Override
    public String toString() {
        return "Triangular Prism {sideA= " + sideA + ", sideB= " + sideB + ", sideC= " + sideC + ", height= " + height + ", Volume= " + volume() + ", Surface Area = " + surfaceArea() + "}";
    }
}

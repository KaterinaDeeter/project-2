package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape pyramid = new Pyramid(2.0, 4.0, 2.0);
        ThreeDimensionalShape triangularPrism = new TriangularPrism(1.0, 1.0, 1.0, 1.0); //this class was created by ChatGPT

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(pyramid);
        shapes.add(triangularPrism);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given.
         */

        Sphere sphere1 = new Sphere(2.0);
        System.out.println(sphere1);
    }

}


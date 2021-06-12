package com.main;

import models.*;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    List<Shapes> shapes = new ArrayList<>();
	    shapes.add(new Circle("Circle"));
	    shapes.add(new Rectangle("Rectangle"));
	    shapes.add(new Triangle("Triangle"));

        for (Shapes shape :shapes) {
            System.out.println("The area of the "+shape.getName() + " is " + shape.area());
        }
    }
}

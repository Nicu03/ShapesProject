package models;

public class Rectangle implements Shapes{

    @Override
    public void area() {
        System.out.println("Area of Rectangle is calculated using this: L * W");
    }
}

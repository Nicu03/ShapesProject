package models;

public class Triangle implements Shapes{
    @Override
    public void area() {
        System.out.println("Area of Triangle is calculated using this: 1/2*b*h");
    }
}

package models;

public class Circle implements Shapes{
    @Override
    public void area() {
        System.out.println("Area of circle is calculated using this: πR²");
    }
}

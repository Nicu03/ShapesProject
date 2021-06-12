package models;

public class Triangle extends Shapes{

    public Triangle(String name) {
        super(name);
    }

    @Override
    public String area() {
        return "1/2*b*h";
    }
}

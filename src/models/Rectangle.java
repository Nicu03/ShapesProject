package models;

public class Rectangle extends Shapes {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public String area() {
        return "L * W";
    }
}

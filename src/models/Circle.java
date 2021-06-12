package models;

public class Circle extends Shapes {
    public Circle(String name) {
        super(name);
    }
    @Override
    public String area() {
        return "πR²";
    }
}


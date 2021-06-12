package models;

public abstract class Shapes{
    private String name;
    public Shapes(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract String area();

}

package PracticeThree;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        color = "red";
        filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(String color){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(boolean filled){
       return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimetr();
    public String toString(){
        return "Площадь";
    }






}

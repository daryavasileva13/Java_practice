package PracticeThree;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        this.width = 2;
        this.length = 3;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "blue";
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.filled = filled;
        this.color = color;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimetr(){
        return width+width+length+length;
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }

}


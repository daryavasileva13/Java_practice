package PracticeThree;

public class Square extends Rectangle{
    double side = width;
    public Square(){
        this.filled = false;
        this.color = "blue";
        this.side = 2;
    }
    public Square(double side){
        this.side = side;
        this.filled = false;
        this.color = "blue";
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }

    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }
    @Override
    public String toString() {
        return "Shape: square, side: " + this.side + ", color: " + this.color;
    }






}

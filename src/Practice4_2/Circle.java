package Practice4_2;

public class Circle {
    private double radius;
    private boolean filled;

    public Circle(double radius){
        this.filled = false;
        this.radius = radius;
    }

    public Circle(double radius, boolean filled){
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + this.radius;
    }
}
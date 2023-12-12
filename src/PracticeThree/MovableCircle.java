package PracticeThree;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString(){
        return "x: " + center.x + ", y: " + center.y + ", xSpeed: " + center.xSpeed + ", ySpeed: " + center.ySpeed;
    }
    public void moveUp(){
        center.y += 1;
    }
    public void moveDown(){
        center.y -= 1;
    }
    public void moveLeft(){
        center.x -= 1;
    }
    public void moveRight(){
        center.x += 1;
    }
}

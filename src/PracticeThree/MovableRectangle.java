package PracticeThree;

public class MovableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        topleft.x = x1;
        topleft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topleft.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;

    }

    public String toString(){
        return "Верхняя левая точка: (" + topleft.x + "," + topleft.y + ") Верхняя правая точка: (" +  bottomRight.x +","  + bottomRight.y + ")";
    }

    public boolean isSameSpeed(int x, int y){
        if (topleft.ySpeed == bottomRight.ySpeed) {
            return true;
        } else {
            return false;
        }

    }

    public void moveUp(){
        topleft.y += 1;
        bottomRight.y += 1;
    }
    public void moveDown(){
        topleft.y -= 1;
        bottomRight.y -= 1;
    }
    public void moveLeft(){
        topleft.x -= 1;
        bottomRight.x -= 1;
    }
    public void moveRight(){
        topleft.x += 1;
        bottomRight.x += 1;
    }



}

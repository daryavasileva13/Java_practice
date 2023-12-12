package Practice4_2;


//public class Human {
//    private Head head;
//    private Leg leftLeg;
//    private Leg rightLeg;
//    private Hand leftHand;
//    private Hand rightHand;
//
//    public Human(){
//        head = new Head();
//        leftLeg = new Leg();
//        rightLeg = new Leg();
//        leftHand = new Hand();
//        rightHand = new Hand();
//    }
//
//    public void walk(){
//        System.out.println("Идти");
//    }
//    public void turnLeft(){
//        head.turnLeft();
//    }
//    public void turnRight(){
//        head.turnRight();
//    }
//
//}


class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void speak(String message) {
        head.speak(message);
    }

    public void walk() {
        leftLeg.move();
        rightLeg.move();
    }

    public void wave() {
        leftHand.wave();
        rightHand.wave();
    }
}

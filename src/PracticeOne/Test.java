package PracticeOne;

import PracticeOne.Ball;

public class Test {
    public static void main(String[] args){
        Ball b1 = new Ball("футбольный", 2);
        Ball b2 = new Ball("волейбольный");
        Ball b3 = new Ball();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.result();
        b2.result();
    }
}

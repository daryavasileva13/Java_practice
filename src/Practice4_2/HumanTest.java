package Practice4_2;
import Practice4_2.Human;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head();
        Leg leftLeg = new Leg();
        Leg rightLeg = new Leg();
        Hand leftHand = new Hand();
        Hand rightHand = new Hand();

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        human.speak("Привет!");
        human.walk();
        human.wave();
    }
}

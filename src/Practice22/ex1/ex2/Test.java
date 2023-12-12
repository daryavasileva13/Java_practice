package Practice22.ex1.ex2;

public class Test {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();

        Chair victorianChair = factory.createVictorianChair(100);
        System.out.println(((VictorianChair)victorianChair).getAge());

        Chair magicChair = factory.createMagicChair();
        ((MagicChair)magicChair).doMagic();

        Chair functionalChair = factory.createFunctionalChair();
        System.out.println(((FunctionalChair)functionalChair).sum(10,5));

        Client client = new Client();
        client.setChair(magicChair);
        client.sit();
    }
}
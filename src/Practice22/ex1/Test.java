package Practice22.ex1;

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex(15,100);
        System.out.println(complex);
    }
}
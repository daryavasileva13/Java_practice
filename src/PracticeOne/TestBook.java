package PracticeOne;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Колобок", 15);
        Book b2 = new Book("Преступление и наказание");
        Book b3 = new Book();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.reed();
        b2.reed();
    }
}

package Practice4_2;

public class Book {
    private String nameBook;
    int year;
    String author;

    public Book(String name, String a, int b ){
        nameBook = name;
        author = a;
        year = b;
    }
//    public Book(String name){
//        nameBook = name;
//        pages = 100;
//    }
//    public Book(){
//        name = "Мастер и Маргарита";
//        pages = 100;
//    }

    public void setNameBook(String nameBook){
        this.nameBook = nameBook;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getNameBook(String nameBook){
        return nameBook;
    }
    public int getYear(int year){
        return year;
    }
    public String getAuthor(String author){ return author;}

    public String toString(){
        return "Название книги: " + this.nameBook + "; Автор: " + this.author + "; Год написания: " + this.year;
    }

}

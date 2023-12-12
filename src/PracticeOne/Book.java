package PracticeOne;

public class Book {
    private String name;
    int pages;

    public Book(String n, int p){
        name = n;
        pages = p;
    }
    public Book(String n){
        name = n;
        pages = 100;
    }
    public Book(){
        name = "Мастер и Маргарита";
        pages = 100;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String getName(String name){
        return name;
    }
    public int getPages(int pages){
        return pages;
    }

    public String toString(){
        return "Название книги: " + this.name + "; Количество страниц: " + this.pages;
    }

    public void reed(){
        if (pages < 50){
            System.out.println(name +" ты прочтешь за три часа");
        }
        else if (pages == 100){
            System.out.println(name +" ты прочитаешь за 8 часов");
        }
        else if (pages > 100){
            System.out.println(name +" ты будешь долго читать книгу");
        }
    }
}

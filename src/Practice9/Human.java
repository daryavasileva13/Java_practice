package Practice9;

class Human implements Nameable {
    protected String name;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String toString(){
        return "Имя пользователя:  " + name;
    }
}
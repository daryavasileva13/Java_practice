package Practice9;

class Planet implements Nameable {
    private String name;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String toString(){
        return "Название планеты: " + name;
    }
}
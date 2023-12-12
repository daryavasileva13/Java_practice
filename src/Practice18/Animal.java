package Practice18;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;

    public Animal(){
        name = "Лошадь";
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
}

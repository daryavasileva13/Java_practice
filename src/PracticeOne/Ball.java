package PracticeOne;

public class Ball {
    private String type;
    int goal;

    public Ball(String t, int g){
        type = t;
        goal = g;
    }
    public Ball(String t){
        type = t;
        goal = 0;
    }
    public Ball(){
        type = "баскетбольный";
        goal = 0;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setGoal(int goal){
        this.goal = goal;
    }
    public String getType(String type){
        return type;
    }
    public int getGoal(int goal){
        return goal;
    }

    public String toString(){
        return "Тип мяча: " + this.type + "; Количество голов: " + this.goal;
    }

    public void result(){
        if (goal == 0){
            System.out.println("Ты проиграл :(");
        }
        else if (goal == 1){
            System.out.println("Ты молодец!");
        }
        else if (goal > 1){
            System.out.println("Ты нереально крутой!!!");
        }
    }




}

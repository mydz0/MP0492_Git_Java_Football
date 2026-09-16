package worldcup;

public class Player extends Person {
    private String position;

    public void passBall(){
        System.err.println("Pass Ball");
    }


public String getPosition(){
    return position;
}

public void setPosition(String position){
    this.position = position;
}
}
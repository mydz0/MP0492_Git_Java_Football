package worldcup;

public class Ball {
    private String material;

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void play(){
        System.out.println("play");
    }
}

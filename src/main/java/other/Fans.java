package other;

public class Fans {
    private static boolean isOn;
    private String material;
    private int count;

    public Fans(String material, int count){
        this.material = material;
        this.count = count;
    }

    public static void setOn(boolean isOn) {
        Fans.isOn = isOn;
    }

    public boolean condition(){
        return isOn;
    }

    public String allert() {
        if (isOn){return "Вентиляторы в норме." ;}
        else {return "Вентиляторы не работают." ;}
    }

}

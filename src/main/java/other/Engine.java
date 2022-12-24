package other;

public class Engine {
    private String material;
    private static boolean isOn;
    private double version;

    public Engine (String material, double version) {
        this.material = material;
        this.version = version;
    }

    public static void setOn(boolean isOn) {
        Engine.isOn = isOn;
    }

    public boolean condition(){
        return isOn;
    }

    public String allert() {
        if (isOn){return "Двигатель в норме." ;}
        else {return "Двигатель не работает." ;}
    }
}

package other;

public class Thermostats {
    private static boolean isOn;
    private String materia;
    private int count;
    public static byte levelOfArmored;


    public Thermostats (String material, int count) {
        this.materia = material;
        this.count = count;
    }
    

    public static void setOn(boolean isOn) {
        Thermostats.isOn = isOn;
    }

    public boolean condition(){
        return isOn;
    }

    public String allert() {
        if (isOn){return "Термостаты в норме." ;}
        else {return "Термостаты не работают." ;}
    }
}

package other;


public class AirCleaners {
    private int count;
    private String material;
    private static boolean isOn;

    public AirCleaners(String material, int count) {
        this.material = material;
        this.count = count;
    }

    public static void setOn(boolean isOn) {
        AirCleaners.isOn = isOn;
    }
    public boolean condition(){
        return isOn;
    }

    public String allert() {
        if (isOn){return "Очистители воздуха в норме." ;}
        else {return "Очистители воздуха не работают." ;}
    }
}



package other;

public class ElectricMachineOfControl {
    private static boolean power;

    public ElectricMachineOfControl(){

    }

    public boolean isPower() {
        return power;
    }

    public static void setPower(boolean power) {
        ElectricMachineOfControl.power = power;
    }

    public void superProgram(boolean isPower){
        if (isPower){
            Engine.setOn(true);
            AirCleaners.setOn(true);
            Fans.setOn(true);
            Thermostats.setOn(true);
        }

    }
}

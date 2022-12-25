package Cabins;

import other.ElectricMachineOfControl;
import technical.IDescribable;
import technical.PartsOfRocket;
import technical.Places;

public class CabinOfButton implements IDescribable {
    private PartsOfRocket location;
    private Places place;
    private String door;
    private String nameplateText;
    private String table;
    private String button;


    public CabinOfButton (String door, String nameplateText, Places place, PartsOfRocket location){
        this.door = door;
        this.nameplateText = nameplateText;
        this.place = place;
        this.location = location;
    }

    public void buttonConditionCheck(boolean isButtonPressed){
        if (isButtonPressed){
            ElectricMachineOfControl.setPower(true);
        }
    }


    @Override
    public String describe() {
        return "Кнопочная кабина находилась " + place + " " + location + ".\n" + "На " + door +  "висела табличка с надписью " + nameplateText +
                ".\n" + Places.IN + " кнопочной кабине на " + table + " находилась " + button + ".";
    }
}

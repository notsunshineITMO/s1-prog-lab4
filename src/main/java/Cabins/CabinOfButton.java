package Cabins;

import other.ElectricMachineOfControl;
import technical.IDescribable;
import technical.PartsOfRocket;
import technical.Places;

public class CabinOfButton implements IDescribable {
    private Places place;
    private String door;
    private String nameplateText;
    private String table;
    private String button;
    public final static PartsOfRocket location = PartsOfRocket.UPPER_PART;

    public CabinOfButton (String door, String nameplateText, Places place){
        this.door = door;
        this.nameplateText = nameplateText;
        this.place = place;
    }

    public Places getPlace() {
        return place;
    }

    public void setPlace(Places place) {
        this.place = place;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getNameplateText() {
        return nameplateText;
    }

    public void setNameplateText(String nameplateText) {
        this.nameplateText = nameplateText;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public void buttonConditionCheck(boolean isButtonPressed){
        if (isButtonPressed){
            ElectricMachineOfControl.setPower(true);
        }
    }


    @Override
    public String describe() {
        return "Кнопочная кабина находилась в" + location + " ракеты.\n" + "На " + door +  "висела табличка с надписью " + nameplateText +
                ".\n" + Places.IN + " кнопочной кабине на " + table + " находилась " + button + ".";
    }
}

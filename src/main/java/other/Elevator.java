package other;

import technical.IDescribable;
import technical.Places;

public class Elevator implements ElevatorPanel, IDescribable {
    private boolean upDownValue;
    private int numberOfLevel;

    public Elevator(){

    }

    public void elevatorCall(boolean upDownValue, int numberOfLevel){
        setUpDownValue(upDownValue);
        setNumberOfLevel(numberOfLevel);
    }

    public boolean isUpDownValue() {
        return upDownValue;
    }

    public void setUpDownValue(boolean upDownValue) {
        this.upDownValue = upDownValue;
    }

    public int getNumberOfLevel() {
        return numberOfLevel;
    }

    public void setNumberOfLevel(int numberOfLevel) {
        this.numberOfLevel = numberOfLevel;
    }

    @Override
    public String buttonToUp(boolean value) {
        if (value){
            return "наверх ";
        }
        else {
            return buttonToDown(!value);
        }
    }

    @Override
    public String buttonToDown(boolean value) {
        if (value){
            return "вниз ";
        }
        else {
            return "никуда ";
        }
    }

    @Override
    public String exactlyLevel(int value) {
        return String.valueOf(value);
    }

    @Override
    public String doorsIsOpen(boolean value) {
        if (value){
            return "открыты.";
        }
        else {
            return "закрыты.";
        }
    }


    @Override
    public String describe() {
        return "Лифт едет " + buttonToUp(upDownValue) + "на " + exactlyLevel(numberOfLevel) + " этаж.";
    }
}

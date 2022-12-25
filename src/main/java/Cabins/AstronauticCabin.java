package Cabins;

import technical.PartsOfRocket;
import technical.Places;

import java.lang.reflect.Parameter;

public class AstronauticCabin {
    private String telescope;
    private String radioLocator;
    private String interactiveMap;
    public final static PartsOfRocket location = PartsOfRocket.UPPER_PART;

    public AstronauticCabin (String telescope, String radioLocator, String interactiveMap){
        this.telescope = telescope;
        this.radioLocator = radioLocator;
        this.interactiveMap = interactiveMap;
    }

    public void setTelescope(String telescope) {
        this.telescope = telescope;
    }

    public void setRadioLocator(String radioLocator) {
        this.radioLocator = radioLocator;
    }

    public void setInteractiveMap(String interactiveMap) {
        this.interactiveMap = interactiveMap;
    }

    public String getTelescope() {
        return telescope;
    }

    public String getRadioLocator() {
        return radioLocator;
    }

    public String getInteractiveMap() {
        return interactiveMap;
    }
}

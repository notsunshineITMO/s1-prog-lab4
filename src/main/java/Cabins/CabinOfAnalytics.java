package Cabins;

import technical.PartsOfRocket;

public class CabinOfAnalytics {
    private String microscope;
    private String vials;
    private String mineralSamples;
    public final static PartsOfRocket location = PartsOfRocket.UPPER_PART;

    public CabinOfAnalytics(String microscope, String vials, String mineralSamples){
        this.microscope = microscope;
        this.vials = vials;
        this.mineralSamples = mineralSamples;
    }

    public String getMicroscope() {
        return microscope;
    }

    public void setMicroscope(String microscope) {
        this.microscope = microscope;
    }

    public String getVials() {
        return vials;
    }

    public void setVials(String vials) {
        this.vials = vials;
    }

    public String getMineralSamples() {
        return mineralSamples;
    }

    public void setMineralSamples(String mineralSamples) {
        this.mineralSamples = mineralSamples;
    }
}

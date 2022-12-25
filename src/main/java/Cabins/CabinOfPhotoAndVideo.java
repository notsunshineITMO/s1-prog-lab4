package Cabins;

public class CabinOfPhotoAndVideo {
    private String cameras;
    private String lenses;
    private String softBoxes;

    public CabinOfPhotoAndVideo(String cameras, String lenses, String softBoxes){
        this.cameras = cameras;
        this.lenses = lenses;
        this.softBoxes = softBoxes;
    }

    public void setCameras(String cameras) {
        this.cameras = cameras;
    }

    public void setLenses(String lenses) {
        this.lenses = lenses;
    }

    public void setSoftBoxes(String softBoxes) {
        this.softBoxes = softBoxes;
    }

    public String getCameras() {
        return cameras;
    }

    public String getLenses() {
        return lenses;
    }

    public String getSoftBoxes() {
        return softBoxes;
    }
}

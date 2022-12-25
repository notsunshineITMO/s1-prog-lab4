package Cabins;


import other.AntiGravityDevice;
import technical.PartsOfRocket;

public class CabinOfControl {
    public final static PartsOfRocket location = PartsOfRocket.UPPER_PART;
    private String authorOfAntiGravityDevice;
    private String materialOfAntiGravityDevice;
    private double versionOfAntiGravityDevice;
    private final AntiGravityDevice antiGravityDevice = new AntiGravityDevice(
            authorOfAntiGravityDevice,
            materialOfAntiGravityDevice,
            versionOfAntiGravityDevice);
    public CabinOfControl(String authorOfAntiGravityDevice, String materialOfAntiGravityDevice, double versionOfAntiGravityDevice) {
        this.authorOfAntiGravityDevice = authorOfAntiGravityDevice;
        this.materialOfAntiGravityDevice = materialOfAntiGravityDevice;
        this.versionOfAntiGravityDevice = versionOfAntiGravityDevice;
    }
}
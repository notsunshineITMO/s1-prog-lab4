package Cabins;

import other.AntiGravityDevice;

public class CabinInPavilion {
    private String size;
    private float transparency;
    private String material;
    private String authorOfAntiGravityDevice;
    private String materialOfAntiGravityDevice;
    private double versionOfAntiGravityDevice;
    private final AntiGravityDevice antiGravityDevice = new AntiGravityDevice(
            authorOfAntiGravityDevice,
            materialOfAntiGravityDevice,
            versionOfAntiGravityDevice);
    public CabinInPavilion(String authorOfAntiGravityDevice,
                           String materialOfAntiGravityDevice,
                           double versionOfAntiGravityDevice,
                           String size,
                           float transparency,
                           String material) {
        this.authorOfAntiGravityDevice = authorOfAntiGravityDevice;
        this.materialOfAntiGravityDevice = materialOfAntiGravityDevice;
        this.versionOfAntiGravityDevice = versionOfAntiGravityDevice;
        this.size = size;
        this.transparency = transparency;
        this.material = material;
    }

}

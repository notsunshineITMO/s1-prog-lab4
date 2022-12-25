package Cabins;


import technical.PartsOfRocket;

public class CabinOfControl {
    public final static PartsOfRocket location = PartsOfRocket.UPPER_PART;
    public CabinOfControl() {

    }

    private static class AntiGravityDevice {
        public String author;
        public String material;
        public double version;

        public AntiGravityDevice(String author, String material, double version) {
            this.author = author;
            this.material = material;
            this.version = version;
        }
    }
}
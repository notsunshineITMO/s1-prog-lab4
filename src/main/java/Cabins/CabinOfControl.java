package Cabins;


public class CabinOfControl {
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
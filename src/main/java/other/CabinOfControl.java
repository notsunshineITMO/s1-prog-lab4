package other;


public class CabinOfControl {
    public CabinOfControl(byte levelOfArmored) {
    }

    private static class AntiGravityDevice {
        public String author;
        public String material;
        public double version;
        public AntiGravityDevice(String author, String material, double version){
            this.author = author;
            this.material = material;
            this.version = version;
        }
    }
    private static class ElectricMachineOfControl{
        public String material;
        public double version;
        public ElectricMachineOfControl(String material, double version){
            this.material = material;
            this.version = version;
        }
    }

}
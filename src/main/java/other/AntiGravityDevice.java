package other;

public class AntiGravityDevice {
    public String author;
    public String material;
    public double version;
    public int squareOfAntiGravityArea;

    public AntiGravityDevice(String author, String material, double version) {
        this.author = author;
        this.material = material;
        this.version = version;
    }

    public boolean isButtonOn() {
        return Work.isButtonOn;
    }

    public void setButtonOn(boolean buttonOn) {
        Work.isButtonOn = buttonOn;
    }

    public static class Work {
        static boolean isButtonOn;
        String lunarStone;
        String magnet;
        final double defaultDistanceFromLunarStoneToMagnet = 8.5;
        double distanceFromLunarStoneToMagnet = defaultDistanceFromLunarStoneToMagnet;

        public Work(String lunarStone, String magnet){
            this.lunarStone = lunarStone;
            this.magnet = magnet;
        }
        public double process(){
            distanceFromLunarStoneToMagnet = defaultDistanceFromLunarStoneToMagnet;
            if (isButtonOn) {
                while (distanceFromLunarStoneToMagnet > 0) {
                    distanceFromLunarStoneToMagnet -= 0.5;
                }
                return distanceFromLunarStoneToMagnet;
            }
            else return defaultDistanceFromLunarStoneToMagnet;
        }

        public String getLunarStone() {
            return lunarStone;
        }

        public void setLunarStone(String lunarStone) {
            this.lunarStone = lunarStone;
        }

        public String getMagnet() {
            return magnet;
        }

        public void setMagnet(String magnet) {
            this.magnet = magnet;
        }

        

    }
}

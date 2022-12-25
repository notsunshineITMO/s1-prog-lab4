package person;

import Plants.Vegetables;
import technical.IDescribable;
import technical.Where;

public class Lunatics extends Person implements IDescribable {
    private int count;
    private String location;
    private final Where where = new Where();
    public static Vegetables vegetables = Vegetables.LUNAR_VEGETABLES;

    public Lunatics(String name, double weight, int count) {
        super(name, weight);
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setLocation(String whereExactly, String location) {
        where.setPlace(whereExactly,location);
        this.location = where.getPlace();
    }

    public String getLocation() {
        return location;
    }

    public static Vegetables getVegetables() {
        return vegetables;
    }

    public static void setVegetables(Vegetables vegetables) {
        Lunatics.vegetables = vegetables;
    }

    @Override
    public String describe(){
        return getCount() + " " + getName() + "находились " + getLocation();
    }
}

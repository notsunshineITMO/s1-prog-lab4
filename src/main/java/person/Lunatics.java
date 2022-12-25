package person;

import technical.IDescribable;
import technical.Where;

public class Lunatics extends Person implements IDescribable {
    private int count;
    private String location;
    private final Where where = new Where();

    public Lunatics(String name, int count) {
        super(name);
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

    @Override
    public String describe(){
        return getCount() + " " + getName() + "находились " + getLocation();
    }
}

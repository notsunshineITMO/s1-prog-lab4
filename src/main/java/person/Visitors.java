package person;

import person.activities.ICould;
import person.activities.IFlyable;
import person.activities.IWearUp;
import technical.*;
import person.activities.IAsk;

public class Visitors extends Person implements IDescribable, IAsk, IFlyable, ICould, IWearUp {
    private int count;
    private String location;
    private final Where where = new Where();

    public Visitors (String name, int count) {
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
    public void Ask(PartsOfRocket part) {
        System.out.print("Посетители спрашивают: ");
        String question = "В чём идея ";
        System.out.println(question + part + "?");
    }

    @Override
    public String Fly() {
        if (getLocation().equals("IN PAVILION_OF_ZERO_GRAVITY ")){
        return getName() + " летает";
        }
        return null;
    }

    @Override
    public String must(String whatToDo) {
        return this.name + " обязаны " + whatToDo;
    }

    @Override
    public String toDo(String whatToDo) {
        return this.name + " " + whatToDo;
    }

    @Override
    public String lay(String where) {
        return this.name + could + " полежать " + where;
    }

    @Override
    public String sit(String where) {
        return this.name + could + " посидеть " + where;
    }

    @Override
    public String examine(String what) {
        return this.name + could + "изучить " + what;
    }

    @Override
    public String describe(){
        return getCount() + " " + getName() + "находились " + getLocation();
    }

}



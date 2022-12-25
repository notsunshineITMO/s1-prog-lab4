package person;

import other.AntiGravityDevice;
import person.activities.IFlyable;
import person.activities.IInterested;
import person.activities.ITake;
import technical.*;
import person.activities.IAsk;

public class Neznaika extends Person implements IDescribable, IAsk, IFlyable, IInterested, ITake {
    private String location;
    private Where where = new Where();

    public Neznaika(String name, double weight) {
        super(name,weight);
    }


    public void setLocation(String whereExactly, String location) {
        where.setPlace(whereExactly,location);
        this.location = where.getPlace();
    }
    public String getLocation() {
        return location;
    }


    public void Waits(String whatTime){
        System.out.println(name + " подождал " + whatTime);
    }


    @Override
    public void Ask(PartsOfRocket part) {
        final double RANDOMIZE_COEF = Math.random() * 100;
        if (RANDOMIZE_COEF <= 50){System.out.print("Незнайка интересуется: ");}
        else {System.out.print("Незнайка спрашивает: ");}
        String question = "В чём идея ";
        System.out.println(question + part + "?");
    }

    @Override
    public String Fly() {
        if (getLocation().equals("IN PAVILION_OF_ZERO_GRAVITY ")){
            return getName() + "летает";
        }
        return null;
    }

    @Override
    public void interested(Places what) {
        System.out.println(this.name + " очень-очень сильно интересуется " +  what);
    }

    @Override
    public void take(String what) {
        System.out.println(this.name + isTake + what);
    }

    @Override
    public String describe(){
        return getName() + "находился " + getLocation();
    }
}


package person;

import Plants.Vegetables;
import person.activities.IDecide;
import person.activities.IGift;
import technical.IDescribable;

public class Znaika extends Person implements IDescribable, IDecide, IGift {
    String aGift;
    String aPerson;
    public Znaika(String name) {
        super(name);
    }

    @Override
    public String giftTo(String what, String whom) {
        return " подарить " + what + whom;
    }

    @Override
    public void decision(String what, String whom) {
        if (Lunatics.vegetables != Vegetables.CUCUMBERS || Lunatics.vegetables != Vegetables.CARROTS || Lunatics.vegetables != Vegetables.TOMATOES) {
            System.out.println(this.name + decide + giftTo(what, whom));
        }
    }
    @Override
    public String describe() {
        return null;
    }
}

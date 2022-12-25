package person;

import java.util.Objects;

public abstract class Person {
    public String name;
    public double weight;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name + " ";
    }

    @Override
    public String toString() {
        return "Имя " + this.name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
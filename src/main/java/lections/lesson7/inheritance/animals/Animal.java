package lections.lesson7.inheritance.animals;

public class Animal {

    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void voice() {

    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Animal o = (Animal) other;
        if (!name.equals(o.name)) {
            return false;
        }
        return age == o.age;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Animal animal = (Animal) o;

        if (age != animal.age) {
            return false;
        }
        return Objects.equals(name, animal.name);
    }
   */
}

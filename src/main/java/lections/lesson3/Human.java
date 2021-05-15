package lections.lesson3;

public class Human {

    String lastName;
    String firstName;
    Human father;
    Human mother;

    Human(String lastName, String firstName) {
        this(lastName, firstName, null, null);
    }

    Human(String lastName, String firstName, Human father, Human mother) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.father = father;
        this.mother = mother;
    }

}

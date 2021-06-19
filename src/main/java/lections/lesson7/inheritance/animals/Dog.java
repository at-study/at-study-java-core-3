package lections.lesson7.inheritance.animals;

public class Dog extends Animal {

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }



}

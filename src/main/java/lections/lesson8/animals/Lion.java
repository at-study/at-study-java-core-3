package lections.lesson8.animals;

public class Lion extends WildAnimal {

    public Lion(int age) {
        super("Лев", age);
        // some actions
    }

    @Override
    public void voice() {
        System.out.println("Арр");
    }

}

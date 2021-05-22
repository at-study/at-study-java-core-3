package lections.lesson4.humans;

public class HumanApplication {

    public static void main(String[] args) {
        Human human = Human.createHuman();
        human.setName("иван");
        human.setAge(15);
        human.greet();

        System.out.println(human.getName());
    }

}

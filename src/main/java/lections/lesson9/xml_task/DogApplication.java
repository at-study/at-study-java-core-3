package lections.lesson9.xml_task;

public class DogApplication {

    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3);
        System.out.println(dog.toXml());

        Dog newDog1 = new Dog(null, 0);
        newDog1.fromXml("<Dog><Age>155</Age><Name>abcd</Name></Dog>");


        Dog dog1 = new Dog("Шарик", 3);
        Dog dog2 = new Dog("Шарик", 3);

        boolean areEquals = dog1.equals(dog2);
        System.out.println(areEquals);
    }

}

package lections.lesson1;

public class Human {

    String gender;
    int age;
    int height;
    int weight;
    String name;
    Human father;
    Human mother;

    void drink() {

    }

    void eat() {

    }

    void sleep() {

    }

    public static void main(String[] args) {
        Human human = new Human();
        human.gender = "М";
        human.age = 20;
        human.height = 185;
        human.weight = 80;
        human.name = "Иван";

        Human father = new Human();
        father.gender = "М";
        father.age = 45;
        father.height = 177;
        father.weight = 74;
        father.name = "Сергей";

        Human mother = new Human();
        mother.gender = "Ж";
        mother.age = 42;
        mother.height = 165;
        mother.weight = 53;
        mother.name = "Екатерина";

        human.father = father;
        human.mother = mother;

        Human grandFather = new Human();
        grandFather.gender = "М";
        grandFather.age = 68;
        grandFather.height = 174;
        grandFather.weight = 80;
        grandFather.name = "Василий";
        mother.father = grandFather;


    }

}

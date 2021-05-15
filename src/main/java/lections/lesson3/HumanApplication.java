package lections.lesson3;

public class HumanApplication {

    public static void main(String[] args) {
        Human sergey = new Human("Иванов", "Сергей");
        Human elena = new Human("Иванова", "Елена");

        Human mikhail = new Human("Иванов", "Михаил", sergey, elena);
        Human ekaterina = new Human("Иванова", "Екатерина");

        Human aleksander = new Human("Иванов", "Александр", mikhail, ekaterina);
        Human olga = new Human("Иванова", "Ольга");

        Human irina = new Human("Иванова", "Ирина", aleksander, olga);

        System.out.println(irina.father.father.father.firstName);

    }

}

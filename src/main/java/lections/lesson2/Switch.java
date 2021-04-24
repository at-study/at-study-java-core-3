package lections.lesson2;

public class Switch {

    public static void main(String[] args) {
        System.out.println(trafficLight("Зеленый"));
        System.out.println(trafficLight("Желтый"));
        System.out.println(trafficLight("Красный"));
        System.out.println(trafficLight("Синий"));
    }

    // В switch в качеств условия можно использовать примитивы, строки, перечисления(enum)

    static String trafficLight(String color) {
        switch (color) {
            case "Красный":
            case "Желтый":
                return "Ехать нельзя";
            case "Зеленый":
                return "Ехать можно";
            default:
                return "Цвет неизвестный";
        }
    }


}

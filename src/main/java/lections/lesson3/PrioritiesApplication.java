package lections.lesson3;

public class PrioritiesApplication {

    public static void main(String[] args) {
        System.out.println("=====================");
        Priorities instance1 = new Priorities();
        System.out.println(instance1);
        System.out.println(instance1.method().method().method());
        System.out.println("=====================");
        Priorities instance2 = new Priorities().method();
        System.out.println("=====================");
        Priorities instance3 = new Priorities().method();
        System.out.println("=====================");
    }

}

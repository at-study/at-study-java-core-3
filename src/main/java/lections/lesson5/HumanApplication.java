package lections.lesson5;

import lections.lesson5.custom_exceptions.IllegalAgeException;
import lections.lesson5.custom_exceptions.IllegalNameException;
import lections.lesson5.custom_exceptions.NegativeAgeException;
import lections.lesson5.custom_exceptions.TooHighAgeException;
import lections.lesson5.custom_exceptions.ZeroAgeException;

public class HumanApplication {

    public static void main(String[] args) throws IllegalNameException {
        Human ivan = new Human();
        ivan.setName("Ив");
        // Обработка исключений из разных веток наследования
        try {
            ivan.setAge(-60);
        } catch (TooHighAgeException exc) {
            System.out.println("Исключение TooHighAgeException перехвачено.");
        } catch (ZeroAgeException exc) {
            System.out.println("Исключение ZeroAgeException перехвачено.");
        } catch (NegativeAgeException exc) {
            System.out.println("Исключение NegativeAgeException перехвачено.");
        }

        // Обработка исключений по одной иерархии наследования
        // В первую очередь дочерние, затем родительские
        try {
            ivan.setAge(15550);
        } catch (NegativeAgeException exc) {
            System.out.println("NegativeAgeException");
        } catch (IllegalAgeException exc) {
            System.out.println("IllegalAgeException");
        } catch (IllegalArgumentException iae) {

        } catch (RuntimeException rte) {

        } catch (Exception ex) {

        } catch (Throwable thr) {

        }

        ivan.greet();
    }

}

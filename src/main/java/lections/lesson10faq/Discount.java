package lections.lesson10faq;

public class Discount {

    public static int getDiscount(Human human) {
        if (human.getAge() < 18) {
            return 50;
        }
        return 0;
    }

}

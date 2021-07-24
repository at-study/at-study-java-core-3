package lections.lesson10faq;

public class HumanApplication {

    public static void main(String[] args) {
        Human ivan = Human.createHuman("ИВан", 19);
        int discount = Discount.getDiscount(ivan);
        System.out.println("Скидка: " + discount + "%");
    }
}

package lections.lesson16_faq;

public class PassportHolder {

    private static Passport passport;

    private static Passport getPassport() {
        if (passport == null) {
            passport = new Passport("", "");
        }
        return passport;
    }

}

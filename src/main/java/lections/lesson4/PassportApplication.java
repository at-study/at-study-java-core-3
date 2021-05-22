package lections.lesson4;

public class PassportApplication {

    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.setSeries("1111");
        passport.setNumber("111111");

        Passport passport2 = new Passport()
                .setSeries("2222")
                .setNumber("222222");


        Passport passport3 = new Passport("2234", null, 123)
                .setNumber("123456");


    }
}

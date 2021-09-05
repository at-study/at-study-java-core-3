package lections.lesson16_faq;

public class Application {

    public static void main(String[] args) {
        Passport passport = new Passport("1234", "567890");
        Passport passport2 = new Passport("1234", "567890") {
            private String name;

            private void sayMyName() {
                System.out.println(name);
            }

            {
                name = "12345";
                sayMyName();
            }
        };

    }

}

package lections.lesson2;

public class ValidPasswords {

    public static void main(String[] args) {
        String[] passwords = {"1qaz@WSX", "pass1", "P$ssw0rddd", "fdgjnUIO%a12", "ghhjkj$of#33F", "f123", "f5324"};
        String[] validPasswords = new String[10];

        int validPasswordsCount = 0;
        boolean isPasswordsContainValidPassword = false;
        int validPasswordIndex = 0;

        for (String password : passwords) {
            if (!password.matches("^.{8,}$")) { // password.length() < 8
                continue;
            }
            if (!password.matches("^.*[A-Z].*$")) { // password.toLowerCase().equals(password)
                continue;
            }
            if (!password.matches("^.*[a-z].*$")) { // password.toUpperCase().equals(password)
                continue;
            }
            if (!password.matches("^.*\\d.*$")) {
                continue;
            }
            if (!password.matches("^.*[!@#$%^&*()].*$")) {
                continue;
            }
            validPasswords[validPasswordIndex++] = password;
            validPasswordsCount++;
            isPasswordsContainValidPassword = true;
        }

        for (String validPassword : validPasswords) {
            if (validPassword == null) {
                break;
            }
            System.out.println(validPassword);
        }

        System.out.println("Количество правильных паролей в массиве равно " + validPasswordsCount);
        System.out.println(
                isPasswordsContainValidPassword
                        ? "В массиве есть подходящий пароль"
                        : "В массиве нет подходящих паролей");
    }

}

package lections.lesson16.annotations.pages;

@Title("Страница авторизации")
public class LoginPage extends Page {

    @Title("Логин")
    private String login = "login";

    @Title("Пароль")
    private String password = "pass";

}

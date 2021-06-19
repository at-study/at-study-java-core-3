package lections.lesson7.inheritance.browser;

public class Application {

    public static void main(String[] args) {
        Browser browser = BrowserFactory.getBrowser();
        browser.open();
        System.out.println(browser);
    }

}

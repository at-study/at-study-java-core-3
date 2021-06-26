package lections.lesson8.browser_app;

import lections.lesson8.browser.Browser;
import lections.lesson8.browser.BrowserFactory;
import lections.lesson8.browser.TakesScreenshot;

public class Application {

    public static void main(String[] args) {
        Browser browser = BrowserFactory.getBrowser();
        browser.openPage("http://google.ru");
        ((TakesScreenshot) browser).takeScreenshot();
    }

}

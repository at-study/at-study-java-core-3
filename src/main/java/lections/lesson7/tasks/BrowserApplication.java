package lections.lesson7.tasks;

import lections.lesson7.inheritance.browser.Browser;
import lections.lesson7.inheritance.browser.BrowserFactory;

public class BrowserApplication {

    public static void main(String[] args) {
        Browser browser = BrowserFactory.getBrowser();
    }

}

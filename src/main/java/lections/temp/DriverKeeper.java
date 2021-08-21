package lections.temp;

import lections.lesson8.browser.Browser;
import lections.lesson8.browser.BrowserFactory;

public class DriverKeeper {

    private static final ThreadLocal<Browser> keeper = new ThreadLocal<>();

    public static Browser getBrowser() {
        if (keeper.get() == null) {
            Browser browser = BrowserFactory.getBrowser();
            keeper.set(browser);
        }
        return keeper.get();
    }

    public static void removeBrowser() {
        keeper.set(null);
    }

}

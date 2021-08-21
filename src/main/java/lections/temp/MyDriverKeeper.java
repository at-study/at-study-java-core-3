package lections.temp;

import lections.lesson8.browser.Browser;
import lections.lesson8.browser.BrowserFactory;

public class MyDriverKeeper {
    private final Browser browser;
    private boolean isActive = true;

    public MyDriverKeeper(Browser browser) {
        this.browser = browser;
    }

    public MyDriverKeeper() {
        this.browser = BrowserFactory.getBrowser();
    }

    public Browser getBrowser() {
        if (!isActive) {
            throw new IllegalStateException();
        }
        return browser;
    }

    public void removeBrowser() {
        isActive = false;
    }
}

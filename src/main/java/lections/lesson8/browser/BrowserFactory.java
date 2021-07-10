package lections.lesson8.browser;

import lections.lesson10.properties.Property;

public class BrowserFactory {

    public static Browser getBrowser() {
        String browserName = Property.getStringProperty("browser");
        switch (browserName) {
            case "firefox":
                return new Firefox();
            case "opera":
                return new Opera();
            case "chrome":
                return new Chrome();
            default:
                throw new IllegalArgumentException("Неизвестный браузер: " + browserName);
        }
    }
}

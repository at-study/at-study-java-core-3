package lections.lesson8.browser;

public class BrowserFactory {

    public static Browser getBrowser() {
        String browserName = System.getProperty("browser");
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

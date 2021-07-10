package lections.lesson10.properties;

import lections.lesson8.browser.Browser;
import lections.lesson8.browser.BrowserFactory;

public class PropertyApplication {

    public static void main(String[] args) {
        System.out.println("Current properties: " + System.getProperty("properties", "application.properties"));
        String protocol = Property.getStringProperty("protocol");
        String host = Property.getStringProperty("url");
        Integer port = Property.getIntegerProperty("port");
        Boolean isRemote = Property.getBooleanProperty("is_remote");

        String fullUrl = String.format("%s://%s:%s/path/to/resource?is_remote=%s", protocol, host, port, isRemote);

        Browser browser = BrowserFactory.getBrowser();
        browser.openPage(fullUrl);
    }
}

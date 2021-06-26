package lections.lesson8.browser;

public class Chrome implements Browser, TakesScreenshot {

    Chrome() {

    }

    @Override
    public void openPage(String url) {
        System.out.println("В Chrome открыта страница " + url);
    }

    @Override
    public void takeScreenshot() {
        System.out.println("Сделан скриншот в Chrome");
    }
}

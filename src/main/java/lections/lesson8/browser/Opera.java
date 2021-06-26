package lections.lesson8.browser;

public class Opera implements Browser, TakesScreenshot {

    Opera() {

    }

    @Override
    public void openPage(String url) {
        System.out.println("В Opera открыта страница " + url);
    }

    @Override
    public void takeScreenshot() {
        System.out.println("Сделан скриншот в Opera");
    }
}

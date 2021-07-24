package lections.lesson8.browser;

public class Firefox implements Browser, TakesScreenshot {

    Firefox() {

    }

    @Override
    public void openPage(String url) {
        System.out.println("В Firefox открыта страница " + url);
    }

    @Override
    public void takeScreenshot() {
        System.out.println("Сделан скриншот в Firefox");
    }
}

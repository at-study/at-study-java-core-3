package lections.temp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Application {

    public static void main(String[] args) {
        Runnable runnable = () -> DriverKeeper.getBrowser().openPage("http://google.com");

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }


        MyDriverKeeper keeper = new MyDriverKeeper();

    }

    @Test
    @DisplayName("Я выбираю меню А, подменю Б")
    public void switchMenus() {

    }

}

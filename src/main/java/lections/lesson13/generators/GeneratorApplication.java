package lections.lesson13.generators;

import java.util.Random;

import lections.lesson13.flyable.Bird;
import lections.lesson8.browser.Browser;
import lections.lesson8.browser.BrowserFactory;

public class GeneratorApplication {
    private static Bird bufferedBird;

    private static Bird getBufferedBird() {
        if (bufferedBird == null) {
            bufferedBird = new Bird();
        }
        return bufferedBird;
    }

    public static void main(String[] args) {
        Generator<String> helloWorldGenerator = () -> "Hello, World";
        String hw = helloWorldGenerator.generate();

        Generator<Integer> randomNumberGenerator = () -> new Random().nextInt(100);
        int random = randomNumberGenerator.generate();

        Generator<Bird> newBirdGenerator = Bird::new;
        Generator<Bird> lazyBirdGenerator = GeneratorApplication::getBufferedBird;

        Generator<Browser> browserGenerator = BrowserFactory::getBrowser;
        browserGenerator.generate().openPage("https://google.com");

        Generator<Browser> yandexPageBrowserGenerator = () -> {
            Browser browser = BrowserFactory.getBrowser();
            browser.openPage("https://yandex.ru");
            return browser;
        };
        yandexPageBrowserGenerator.generate();
        yandexPageBrowserGenerator.generate();
        yandexPageBrowserGenerator.generate();
        yandexPageBrowserGenerator.generate();

        final int[] randomNumberSum = {0};
        Generator<Integer> randomNumberGeneratorWithSum = () -> {
            int generated = new Random().nextInt(100);
            randomNumberSum[0] += generated;
            return generated;
        };

    }

}

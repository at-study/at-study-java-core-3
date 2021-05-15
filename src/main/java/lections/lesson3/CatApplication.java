package lections.lesson3;

public class CatApplication {

    int a = 3;

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 5, 3);
        barsik.sayMyName();
        Cat unnamedCat = new Cat(4, 2);
        unnamedCat.sayMyName();
        unnamedCat = new Cat(5, 3);
        unnamedCat.sayMyName();

        Cat barsikCopy = new Cat(new Cat("Мурзик", 2, 4));

        Cat randomCat = Cat.generateRandomCat();

        Cat[] randomCats = Cat.generateRandomCats(10);

    }
}

package lections.lesson1;

public class Operations {

    static class Cat {

        int age = 0;

    }


    public static void main(String[] args) {
        int a = 2;
        int b = a;
        b = 4;
        System.out.println(a);

        Cat cat1 = new Cat();
        cat1.age = 3;
        Cat cat2 = cat1;
        cat2.age = 5;
        System.out.println(cat1.age);
        System.out.println();

        int i = 5;
        changeI(i);
        System.out.println(i);

        Cat cat = new Cat();
        cat.age = 6;
        changeCatAge(cat);
        System.out.println(cat.age);

        System.out.println();
        int m = 5;
        System.out.println(m++);
        System.out.println(m);

        System.out.println();
        int n = 5;
        System.out.println(++n);
        System.out.println(n);
    }

    static void changeI(int i) {
        i += 2;
        i *= 2; // i = i * 2
        i /= 2; // i = i / 2
        i %= 2; // i = i % 2
        boolean a = true;
        a &= true; // a = a && true
        a |= false; // a = a || false

        i++;
        ++i;
        i--;
        --i;
    }

    static void changeCatAge(Cat cat) {
        cat.age = cat.age + 2;
    }
}

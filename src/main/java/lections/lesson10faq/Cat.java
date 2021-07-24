package lections.lesson10faq;

public class Cat {
    // Вариантов комбинаций name и age - бесконечное множество
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cat cat = (Cat) o;

        if (name != null ? !name.equals(cat.name) : cat.name != null) {
            return false;
        }
        return age != null ? age.equals(cat.age) : cat.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        String s1 = "a2";
        String s2 = "a6";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        switch (s1) {
            case "a2":
                //code
            case "a6":
                //code
        }
    }
}

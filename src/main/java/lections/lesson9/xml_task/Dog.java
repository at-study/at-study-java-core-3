package lections.lesson9.xml_task;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dog implements Xml {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String xml) {
        fromXml(xml);
    }

    public void incrementAge() {
        age++;
    }

    //  <Dog><Name>abcd</Name><Age>155</Age></Dog>
    @Override
    public String toXml() {
        return String.format("<Dog><Name>%s</Name><Age>%d</Age></Dog>", name, age);
    }

    //  <Dog><Name>abcd</Name><Age>155</Age></Dog>
    //  <Dog><Age>155</Age><Name>abcd</Name></Dog>
    @Override
    public void fromXml(String xml) {
        Pattern namePattern = Pattern.compile("^<Dog>.*<Name>(.*)</Name>.*</Dog>$");
        Matcher nameMatcher = namePattern.matcher(xml);
        nameMatcher.find();
        String name = nameMatcher.group(1);
        this.name = name;

        Pattern agePattern = Pattern.compile("^<Dog>.*<Age>(\\d+)</Age>.*</Dog>$");
        Matcher ageMatcher = agePattern.matcher(xml);
        ageMatcher.find();
        String age = ageMatcher.group(1);
        this.age = Integer.parseInt(age);
    }

   /* @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Dog dog = (Dog) other;
        if (!this.name.equals(dog.name)) {
            return false;
        }
        if (this.age != dog.age) {
            return false;
        }
        return true;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Dog dog = (Dog) o;

        if (age != dog.age) {
            return false;
        }
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

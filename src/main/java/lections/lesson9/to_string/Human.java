package lections.lesson9.to_string;

public class Human implements ToJson, Comparable<Human> {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Human(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{")
                .append("\"lastName\":\"").append(lastName).append("\",")
                .append("\"firstName\":\"").append(firstName).append("\",")
                .append("\"patronymic\":\"").append(patronymic).append("\"")
                .append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toJson();
    }

    @Override
    public int compareTo(Human o) {
        if (!lastName.equals(o.lastName)) {
            return lastName.compareTo(o.lastName);
        }
        if (!firstName.equals(o.firstName)) {
            return firstName.compareTo(o.firstName);
        }
        if (!patronymic.equals(o.patronymic)) {
            return patronymic.compareTo(o.patronymic);
        }
        return 0;
    }
}

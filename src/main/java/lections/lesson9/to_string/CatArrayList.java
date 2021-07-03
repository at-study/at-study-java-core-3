package lections.lesson9.to_string;

import java.util.ArrayList;

public class CatArrayList<T extends Cat> extends ArrayList<T> {

    @Override
    public String toString() {
        String header = String.format("В списке находится %d котов%n", size());
        String body = "";
        for (Cat cat : this) {
            body += "- " + cat.toString();
        }
        return header + body;
    }

}

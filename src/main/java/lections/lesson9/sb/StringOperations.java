package lections.lesson9.sb;

public class StringOperations {

    public static void main(String[] args) {
        // StringBuilder и StringBuffer
        // AAAAAAAAAAAAAAAAAAAAAAAAA
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < 25; i++) {
            a.append("A");
        }
        a.toString();
    }

}

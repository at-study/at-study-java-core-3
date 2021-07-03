import org.junit.jupiter.api.Test;

public class SomeTest {


    @Test
    public void someTest() {
        int a = 3;
        // 3 + 5 + 5 + 7
        System.out.println(a++ + ++a + a++ + ++a);
        System.out.println(a);
    }
}

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        String s1 = "TSET";

        for (
                int i = s1.length() - 1;
                i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }

        System.out.println("");
        System.out.println(s1);
    }
}

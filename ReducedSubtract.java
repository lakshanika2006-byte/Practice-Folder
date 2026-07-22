import java.util.*;

public class ReducedSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        while (s.length() > 2) {
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';

                res.append(Math.abs(a - b));
            }

            s = res.toString();
        }

        System.out.println(s);
    }
}
package ImmutableString;
import java.util.Scanner;

public class LeetCode709LowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So'z kiriting : ");
        String s = scanner.nextLine();
        System.out.println(lowerCase(s));

    }

    static String lowerCase(String s) {
        char[] arr = s.toCharArray();
        var st = new StringBuilder();
        for (char i:arr) {
            if (i >= 'A' && i <= 'Z') {
                st.append((char)(i + 32));
            } else {
                st.append(i);
            }
        }
        return st.toString();
    }
}

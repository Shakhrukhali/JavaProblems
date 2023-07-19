package JavaCore.ImmutableString;

import java.util.Scanner;

public class LeetCode709LowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So'z kiriting : ");
        String s = scanner.nextLine();
        System.out.println(lowerCase(s));

    }

    static String lowerCase(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            st.append(c);
        }

        return st.toString();
    }
}

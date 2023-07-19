package JavaCore.ImmutableString;

import java.util.Scanner;

public class UpperCaseMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So'z kiriting : ");
        String s = scanner.nextLine();

        System.out.println(upperCase(s));

    }

    private static String upperCase(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            st.append(c);
        }
        return st.toString();
    }
}

package JavaCore.ImmutableString;

import java.util.Scanner;

public class twoBelgi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So'z kiriting: ");
        String str = scanner.nextLine();
        System.out.println(doubleChar(str));

    }

    static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }
}

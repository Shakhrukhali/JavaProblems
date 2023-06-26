package ImmutableString;

import java.util.Scanner;

public class CodeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So'z kiriting: ");
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        System.out.println(count);


    }
}

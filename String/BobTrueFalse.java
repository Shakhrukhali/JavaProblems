package String;

import java.util.Scanner;

public class BobTrueFalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name : ");
        String name = scanner.nextLine();
        System.out.println(bob(name));
    }

    static boolean bob(String name) {
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) == 'b' && name.charAt(i + 2) == 'b')
                return true;
        }
        return false;
    }
}

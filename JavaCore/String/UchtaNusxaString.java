package JavaCore.String;

import java.util.Scanner;

public class UchtaNusxaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name : ");
        String name = scanner.nextLine();
        System.out.println(tree(name));
    }

    static String tree(String name) {
        if (name.length() < 2) {
            String uchnusxa1 = name.substring(0, 1);
            return uchnusxa1.repeat(3);
        } else {
            String uchnusxa2 = name.substring(0, 2);
            return uchnusxa2.repeat(3);
        }

    }
}

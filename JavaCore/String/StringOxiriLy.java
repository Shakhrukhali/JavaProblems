package JavaCore.String;

import java.util.Scanner;

public class StringOxiriLy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name : ");
        String name = scanner.nextLine();
        System.out.println(oxirily(name));

    }

    static boolean oxirily(String name) {
        return name.endsWith("ly");
    }
}

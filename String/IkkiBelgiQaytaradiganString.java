package String;

import java.util.Scanner;

public class IkkiBelgiQaytaradiganString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str = ");
        String  name = scanner.nextLine();
        System.out.println(two(name));
    }

    private static String two(String name) {
        if(name.length()<=2)
            return name;
        else
            return name.substring(0,2);
    }
}

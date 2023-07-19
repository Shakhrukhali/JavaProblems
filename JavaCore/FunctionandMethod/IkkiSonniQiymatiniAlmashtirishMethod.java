package JavaCore.FunctionandMethod;

import java.util.Scanner;

public class IkkiSonniQiymatiniAlmashtirishMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        almashtir(x, y);
    }

    static void almashtir(int x, int y) {
        int a = x;
        x = y;
        y = a;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

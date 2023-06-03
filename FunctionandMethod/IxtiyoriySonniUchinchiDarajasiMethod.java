package FunctionandMethod;

import java.util.Scanner;

public class IxtiyoriySonniUchinchiDarajasiMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.println(daraja(a, 3));
    }

    static long daraja(int a, int n) {
        return (long) Math.pow(a, n);
    }
}

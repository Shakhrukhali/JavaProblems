package FunctionandMethod;

import java.util.Scanner;

public class BerilganSondaNechtaSakkizBor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(sakkizSoni(n));
    }
    public static int sakkizSoni(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 8)
            return 1 + sakkizSoni(n / 10);
        else
            return sakkizSoni(n / 10);

    }
}

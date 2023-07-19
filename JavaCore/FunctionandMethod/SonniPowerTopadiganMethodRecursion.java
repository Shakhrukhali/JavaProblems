package JavaCore.FunctionandMethod;

import java.util.Scanner;

public class SonniPowerTopadiganMethodRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(a+" ning " +n+" darajasi: "+power(a, n));

    }

    static int power(int a, int n) {
        int s = 1;
        if (n > 0) {
            s = a * power(a, n - 1);
        }
        return s;
    }

}

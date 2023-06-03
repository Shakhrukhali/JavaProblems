package FunctionandMethod;

import java.util.Scanner;

public class FactorilaMethodRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(n+"! = "+recursion(n));
    }

    static int recursion(int n) {
        if (n == 0)
            return 1;
        else return n * recursion(n - 1);
    }
}

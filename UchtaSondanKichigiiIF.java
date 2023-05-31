import java.util.Scanner;

public class UchtaSondanKichigiiIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        System.out.print("c : ");
        int c = scanner.nextInt();

        int min;
        if (a <= b && a <= c)
            min = a;
        else if (b <= a && b <= c)
            min = b;
        else min = c;
        System.out.println("min : " + min);
    }
}

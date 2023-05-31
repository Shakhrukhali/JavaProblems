import java.util.Scanner;

public class UchtaSondanYigindisiEngkattaIkkitaSonniChiqar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        System.out.print("c : ");
        int c = scanner.nextInt();
        int A = a + b;
        int B = b + c;
        int C = c + a;


        if (A > B && A > C) {
            System.out.println("result : " + a + "," + b);
        } else if (B > A && B > C) {
            System.out.println("result : " + b + "," + c);
        } else {
            System.out.println("result : " + a + "," + c);
        }

    }
}

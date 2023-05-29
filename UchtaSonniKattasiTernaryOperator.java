import java.util.Scanner;

public class UchtaSonniKattasiTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        int result = a > b && a > c ? a : (Math.max(b, c));
        System.out.println("max : "+result);
    }
}

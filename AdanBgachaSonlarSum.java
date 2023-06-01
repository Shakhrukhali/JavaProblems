import java.util.Scanner;

public class AdanBgachaSonlarSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("sum : " + sum);

        int summ = (a + b) * (b - a + 1) / 2;
        System.out.println("ikkinchi usul : " + summ);

    }
}

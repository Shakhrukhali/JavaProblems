import java.util.Scanner;

public class IkkisondanKattasiIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("max : "+max);
    }
}

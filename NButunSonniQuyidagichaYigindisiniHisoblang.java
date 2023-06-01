import java.util.Scanner;

public class NButunSonniQuyidagichaYigindisiniHisoblang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        double sum = 1;
        for (int i = 1; i <n; i++) {
            sum += 1. / (i + 1);
        }
        System.out.println("sum : " + sum);
    }

}

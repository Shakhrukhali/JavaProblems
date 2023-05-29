import java.util.Scanner;

public class BitwiseJuftToq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();

        String result = (a & 1) == 1 ? "Toq" : "Juft";
        System.out.println(result);
    }
}

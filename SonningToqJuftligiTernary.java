import java.util.Scanner;

public class SonningToqJuftligiTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = a%2==0?"Juft":"Toq";
        System.out.println(result);
    }
}

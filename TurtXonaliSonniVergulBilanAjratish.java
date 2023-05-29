import java.util.Scanner;

public class TurtXonaliSonniVergulBilanAjratish {
    public static void main(String[] args) {
        //1234 =>1, 2, 3, 4
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int minglik = a / 1000;
        int yuzlik = a % 1000 / 100;
        int unlik = a / 10 % 10;
        int birlik = a % 100 % 10;
        System.out.println(minglik+", "+yuzlik+", "
                +unlik+", "+birlik);



    }
}

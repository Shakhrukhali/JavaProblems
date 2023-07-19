package JavaCore.JavaOperators;

import java.util.Scanner;

public class UchXonaliSonniYuzlikOnlikBoyich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uch xonali son kiriting : ");
        int a = scanner.nextInt();
        //123
        int yuzlik = a / 100;
        int unlik = a / 10 % 10;
        int birlik = a % 100 % 10;
        System.out.println(yuzlik + " ta yuzlik");
        System.out.println(unlik+ " ta o'nlik");
        System.out.println(birlik+ " ta birlik");


    }
}

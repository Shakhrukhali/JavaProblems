import java.util.Scanner;

public class UchtaSondanNechtaMusbatSonBorligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        System.out.print("c : ");
        int c = scanner.nextInt();

        int count = 0;
        if(a>0){
            count++;
        }
        if (b>0){
            count++;
        }
        if (c>0){
            count++;
        }
        System.out.println(count+" ta musbat son bor!!!");

    }

}
package JavaCore.String;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        if(a>b)
            System.out.println("max: "+a);
        else
            System.out.println("max:"+b);

    }
}

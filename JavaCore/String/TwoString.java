package JavaCore.String;

import java.util.Scanner;

public class TwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        String a = sc.nextLine();
        System.out.print("b = ");
        String b = sc.nextLine();
        System.out.println(Birlashtirish(a, b));


    }
    static String Birlashtirish(String a,String b){

        return a+b+b+a;
    }
}

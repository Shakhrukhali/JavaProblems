package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NTaDarajalaridanTashkilTopganArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.pow(2, i);
        }
        System.out.print(Arrays.toString(array));

    }

}

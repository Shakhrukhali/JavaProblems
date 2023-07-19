package JavaCore.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OxirgiLocalMaxElementArray {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(array));
        int lmax = array[0];
        for (int i = 1; i < n - 1; i++) {
            if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
                lmax = array[i];
            }
        }
        System.out.println("local max: " + lmax);
    }
}

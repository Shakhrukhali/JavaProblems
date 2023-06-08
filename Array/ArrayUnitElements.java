package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUnitElements {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1, 10);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int oldingiElement = array[0];
        System.out.print(oldingiElement + " ");

        for (int i = 1; i < array.length; i++) {
            if (array[i] != oldingiElement) {
                System.out.print(array[i] + " ");
                oldingiElement = array[i];
            }
        }

    }
}

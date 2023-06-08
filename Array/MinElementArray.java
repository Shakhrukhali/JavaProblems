package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinElementArray {
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
        int min = array[0];

        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min : " + min);
    }
    }


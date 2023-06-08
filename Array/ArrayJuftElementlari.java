package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayJuftElementlari {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];


        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1, 50);
        }
        System.out.println(Arrays.toString(array));


        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                array2[i] = array[i];
                System.out.print(array2[i] + " ");
            }
        }

    }
}

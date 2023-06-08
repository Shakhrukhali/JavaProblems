package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ElementlariTeskariArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10, 99);

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = n-1; i >= 0 ; i--) {
            System.out.print(array[i]+" ");

        }

    }
}

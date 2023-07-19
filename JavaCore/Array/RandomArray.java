package JavaCore.Array;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[10][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = r.nextInt(19,30);
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }


    }
}

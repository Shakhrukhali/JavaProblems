package JavaCore.Array;

import java.util.Arrays;

public class Tets {
    public static void main(String[] args) {

                int[] array = {1, 1, 2, 2, 2, 3, 4, 5};

                Arrays.sort(array);

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


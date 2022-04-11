package com.minhho.arrays;

/**
 * By MinhHo, 2022/4/11
 */
public class ArrayOfProducts {

    // O(n^2)
    public static int[] arrayOfProducts(int[] array) {
        // result array with length equals to input array
        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            int product = 1;
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                product *= array[j];
            }

            result[i] = product;

        }

        return result;
    }

    public static void runTest() {

        int[] input = new int[]{5, 1, 4, 2};
        int[] output = arrayOfProducts(input);

        for (int i: output) {
            System.out.print(i + ", ");
        }
    }

}

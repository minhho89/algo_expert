package com.minhho.arrays;

import java.util.HashMap;

/**
 * MinhHo 2022/4/11
 */
public class FirstDuplicateValue {

    public static int firstDuplicateValue(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                return array[i];
            }
        }

        return -1;
    }

    public static void runTest() {
        int[] array = new int[]{2, 1, 5, 2, 3, 3, 4};
//        int[] array = new int[]{2, 1, 5, 3, 3, 2, 4};


        int result = firstDuplicateValue(array);

        System.out.println(result);

    }
}

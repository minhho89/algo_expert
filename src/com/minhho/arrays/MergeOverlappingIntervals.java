package com.minhho.arrays;

import java.util.ArrayList;

public class MergeOverlappingIntervals {
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {

        System.out.println(intervals.length);

        ArrayList<Integer[]> list = new ArrayList<>();

        int[][] result = new int[intervals.length][2];
        System.out.println(result.length);
        result[0] = intervals[0];
        int j = 1;
        for (int i = 0; i < result.length; i++) {
            if (isOverlap(result[i], intervals[j])) {
                while (isOverlap(result[i], intervals[j])) {
                    result[i] = merge(result[i], intervals[j]);
                    j++;
                }
            } else {
                if (i == 0) {
                    result[i + 1] = intervals[j];
                } else {
                    result[i] = intervals[j];
                }
                j++;
            }

            if (j == intervals.length) break;
        }

        return result;
    }

    public static boolean isOverlap(int[] array1, int[] array2) {
        int lastIndexArr1 = 1;
        int firstIndexArr2 = 0;

        return (array2[firstIndexArr2] <= array1[lastIndexArr1]);
    }

    public static int[] merge(int[] array1, int[] array2) {
        if (isOverlap(array1, array2)) {
            return new int[]{array1[0], array2[array2.length - 1]};
        }

        return new int[]{};
    }

    public static void runTest() {
        int[][] result = mergeOverlappingIntervals(new int[][]{{1,2},{3,5},{4,7},{6,8},{9, 10}});

        for (int[] array:
             result) {
            System.out.print("[" + array[0] + ", " + array[1] + "]" + ", ");
        }

    }
}

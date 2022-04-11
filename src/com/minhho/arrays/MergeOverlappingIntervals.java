package com.minhho.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervals {
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> list = new ArrayList<>();

        list.add(intervals[0]);
        int j = 1;

        while (j < intervals.length) {
            int lastIndex =list.size() - 1;

            if (isOverlap(list.get(lastIndex), intervals[j])) {
                while (isOverlap(list.get(lastIndex), intervals[j])) {
                    list.set(lastIndex,merge(list.get(lastIndex), intervals[j]));
                    j++;
                    if (j == intervals.length) break;
                }
            } else {
                list.add(intervals[j]);
                j++;
            }

        }


        return list.toArray(new int[list.size()][]);
    }

    public static boolean isOverlap(int[] array1, int[] array2) {

        if (array2[0] <= array1[1]) return true;
        return false;
    }

    public static int[] merge(int[] array1, int[] array2) {
        if (array1[0] <= array2[0] && array2[1] <= array1[1]){
            return new int[]{array1[0], array1[1]};
        }

        if (array1[0] <= array2[0] && array1[1] <= array2[1]){
            return new int[]{array1[0], array2[1]};
        }

        if (array2[0] <= array1[0] && array1[1] <= array2[1]) {
            return new int[]{array2[0], array2[1]};
        }

        if (array2[0] <= array1[0] && array2[1] <= array1[1]) {
            return new int[]{array2[0], array1[1]};
        }

        return new int[]{};
    }

    public static void runTest() {
        int[][] result = mergeOverlappingIntervals(new int[][]{{20, 21},{22, 23},
                {0, 1}, {3,4}, {23,24}, {25,27}, {5,6}, {7, 19}});

        for (int[] array:
             result) {
            System.out.print("[" + array[0] + ", " + array[1] + "]" + ", ");
        }

    }
}

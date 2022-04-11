package com.minhho.arrays;

import java.util.ArrayList;

/**
 * By MinhHo 2022/10/04
 */
public class LongestPeak {
    public static int longestPeak(int[] array) {

        ArrayList<Integer> peaks = findPeakIndexes(array);
        System.out.println(peaks);

        int maxStreak = -1;

        // Edge case
        if (peaks.size() == 0) return 0;

        for (Integer peak: peaks) {
            System.out.println("With peakIndex = " + peak + ", values:");
            int streak = findStreak(array, peak);
            if (maxStreak < streak) maxStreak = streak;

        }

        System.out.println();
        System.out.println("maxStreak = " + maxStreak);
        return maxStreak;
    }

    public static ArrayList<Integer> findPeakIndexes(int[] array) {

        if(array.length == 0) return new ArrayList<>();

        ArrayList<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
                peaks.add(i);
            }
        }

        return peaks;

    }


    public static int findStreak(int[] array, int peakIndex) {

        // Handle edge cases
        if (array.length == 0) return 0;
//        if (array.length == 3) return 3;
        if (peakIndex == 0 || peakIndex == array[array.length - 1]) return -1;

        // Handle main case
        int streak = 0;

        // Left wing strictly decrease
        for (int i = peakIndex; i >= 1; i--) {
            if (array[i] > array[i - 1]) {
                System.out.print(array[i - 1] + ", ");
                streak++;
            } else {
                break;
            }
        }

        System.out.print(array[peakIndex] + " , ");

        // Right wing strictly decrease
        for (int i = peakIndex; i < array.length - 1 ; i++) {
            if (array[i] > array[i + 1]) {
                System.out.print(array[i + 1] + ", ");
                streak++;
            } else {
                break;
            }
        }

        System.out.println();
        return streak + 1;

    }

    public static void runTest() {
//        int[] array = new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
//        int[] array = new int[]{1,3,2};
//        int[] array = new int[]{};
        int[] array = new int[]{1, 3, 2};
//        int[] array = new int[]{1, 2, 3, 4, 5, 1};

        longestPeak(array);
    }
}

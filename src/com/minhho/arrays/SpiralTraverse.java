package com.minhho.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    // https://www.algoexpert.io/questions/Spiral%20Traverse
    public static List<Integer> spiralTraverse(int[][] array) {
        if (array.length == 0) return new ArrayList<Integer>();

        var result = new ArrayList<Integer>();
        var rowStart = 0;
        var rowEnd = array.length - 1;
        var colStart = 0;
        var colEnd = array[0].length - 1;

       while (rowStart <= rowEnd && colStart <= colEnd) {
           for (int col = colStart; col <= colEnd; col++) {
               result.add(array[rowStart][col]);
           }

           for (int row = rowStart + 1; row <= rowEnd; row++) {
               if (rowStart == rowEnd) break;
               result.add(array[row][colEnd]);
           }

           for (int col = colEnd - 1; col >= colStart; col--) {
               result.add(array[rowEnd][col]);
           }

           for (int row = rowEnd - 1; row > rowStart; row--) {
               if (colStart == colEnd) break;
               result.add(array[row][colStart]);
           }

           rowStart++;
           colStart++;
           rowEnd--;
           colEnd--;

       }

        return result;

    }

    public static void run() {
//        int[][] array ={{1, 2, 3, 4},{12, 13, 14, 5},{11, 16, 15, 6},{10,  9,  8, 7}};
//        int[][] array = {{4,2,3,6,7,8,1,9,5,10},{12,19,15,16,20,18,13,17,11,14}};
            int[][] array = {{1,2,3,4},{10,11,12,5},{9,8,7,6}};
        System.out.println(spiralTraverse(array));
    }
}

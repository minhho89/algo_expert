package com.minhho.arrays;

import java.util.List;

/**
 * By MinhHO 2022/04/11
 */
public class ValidateSubSequence {
    // O(n)
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;
        for (Integer i: array) {
            if (seqIdx == sequence.size()) break;

            if (sequence.get(seqIdx) == i) {
                seqIdx++;
            }

        }

        return seqIdx == sequence.size();
    }

}

package com.minhho;

import com.minhho.arrays.*;
import com.minhho.bst.BstConstruction;

public class Main {

    public static void main(String[] args) {
//        SpiralTraverse.run();
//        LongestPeak.runTest();
//        ArrayOfProducts.runTest();
//        FirstDuplicateValue.runTest();
        //MergeOverlappingIntervals.runTest();

        BstConstruction.BST bst = new BstConstruction.BST(10);

        bst.insert(5);
        bst.insert(15);

        bst.print("", bst, false);
    }
}

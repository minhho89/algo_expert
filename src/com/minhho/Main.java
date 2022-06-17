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
        bst.insert(2);
        bst.insert(5);
        bst.insert(1);
        bst.insert(13);
        bst.insert(22);
        bst.insert(14);

        bst.print("", bst, false);

        bst.remove(10);
        bst.print("", bst, false);
    }
}

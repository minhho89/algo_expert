package com.minhho.bst;


public class BstConstruction {
    public static class BST {
        public int value;
        public BST left;
        public BST right;
    
        public BST(int value) {
          this.value = value;
        }
    
        public BST insert(int value) {
            if (value < this.value) {
                // left
                if (this.left == null) {
                    BST newBST = new BST(value);
                    this.left = newBST;
                } else {
                    left.insert(value);
                }

            } else {
                // right
                if (this.right == null) {
                    BST newBST = new BST(value);
                    this.right = newBST;
                } else {
                    right.insert(value);
                }
            }
            return this;
        }
    
        public boolean contains(int value) {
          // Write your code here.
          return false;
        }
    
        public BST remove(int value) {
          // Write your code here.
          // Do not edit the return statement of this method.
          return this;
        }
        public void print(String prefix, BST n, boolean isLeft) {
            if (n != null) {
                print(prefix + "     ", n.right, false);
                System.out.println (prefix + ("|-- ") + n.value);
                print(prefix + "     ", n.left, true);
            }

        }
    }
}

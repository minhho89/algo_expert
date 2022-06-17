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

            if (value < this.value) {
                // left
                if (this.left == null) return false;
                return left.contains(value);
            } else if (value > this.value) {
                // right
                if (this.right == null) return false;
                return right.contains(value);
            } else {
                // equal
                return true;
            }
    
        }
    
        public BST remove(int value) {
          remove(value, null);
          return this;
        }


        public BST remove(int value, BST parent) {
            if (value < this.value) {
                // traverse left
                left.remove(value, this);
            } else if (value > this.value) {
                // traverse right
                right.remove(value, this);
            } else {
                // found it!
                if (left != null && right != null) {
                    this.value = right.getMinValue();
                    right.remove(this.value, this);
                } else if (parent == null) {
                    // remove root
                    if (this.left != null) {
                        this.value = this.left.value;
                        this.right = this.left.right;
                        this.left = this.left.left;
                       
                    } else if (this.right != null) {
                        this.value = this.right.value;
                        this.left = this.right.left;
                        this.right = this.right.right;
                    } else {
                        // one node tree
                    }
                } else if (parent.left == this) {
                    parent.left = this.left != null ? this.left : this.right;
                } else if (parent.right == this) {
                    parent.right = this.left != null ? this.left : this.right;

                }
            }
            return this;
        }

        public int getMinValue() {
            if (left == null) {
                return this.value;
            } else {
                return left.getMinValue();
            }
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

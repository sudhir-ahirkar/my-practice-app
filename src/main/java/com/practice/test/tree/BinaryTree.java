package com.practice.test.tree;

public class BinaryTree {

 private TreeNode root;

    class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data=data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(10);
        TreeNode fourth = new TreeNode(16);
        TreeNode fifth = new TreeNode(100);
        root = first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        third.right=fifth;



    }

    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);

    }
}

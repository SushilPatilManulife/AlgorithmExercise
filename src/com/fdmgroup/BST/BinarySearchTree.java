package com.fdmgroup.BST;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree() {
		root=null;
	}
	public void insert(int key) {
		root = insertRec(root, key);
	}
	public Node insertRec(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key<root.key) {
			root.left = insertRec(root.left, key);
		}
		else {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	public void inorder() {
		inorderRec(root);
	}
	public void inorderRec(Node root) {
			if(root!=null) {
				inorderRec(root.left);
				System.out.println(root.key);
				inorderRec(root.right);
			}
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(100);
		bst.insert(9);
		bst.insert(20);
		bst.insert(40);
		bst.insert(1);
		bst.inorder();
	}
}

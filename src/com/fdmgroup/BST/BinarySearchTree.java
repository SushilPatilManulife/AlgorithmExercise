package com.fdmgroup.BST;

import java.util.Scanner;

public class BinarySearchTree {
	Node root;
	class Node {
		int key;
		Node left, right;
		public Node(int item) {
			super();
			key=item;
			left=right=null;	
		}		
	}
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
	public void preorder() {
		preorderRec(root);
	}
	public void postorder() {
		postorderRec(root);
	}
	public void inorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
	public void preorderRec(Node root) {
		if(root!=null) {
			System.out.println(root.key);
			inorderRec(root.left);
			inorderRec(root.right);
		}
	}
	public void postorderRec(Node root) {
		if(root!=null) {
			inorderRec(root.left);
			inorderRec(root.right);
			System.out.println(root.key);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(100);
		bst.insert(9);
		bst.insert(20);
		bst.insert(40);
		bst.insert(1);
		System.out.println("Enter Tree Traversal Methods\n1.Inorder\n2.Pre-Order\n3.Post-Order\n\nEnter Option:\n");
		int opt = sc.nextInt();
		if (opt == 1) {
			System.out.println("Inorder Tree");
			bst.inorder();
		} else if(opt == 2) {
			System.out.println("Pre-order Tree ");
			bst.preorder();
		}
		else {
			System.out.println("Post-order Tree");
			bst.postorder();
		}
	}
}

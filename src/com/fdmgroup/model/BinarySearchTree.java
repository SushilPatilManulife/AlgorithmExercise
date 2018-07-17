package com.fdmgroup.model;

public class BinarySearchTree {
	class Node{
		int key;
		Node left, right;
		public Node(int item) {
			super();
			key=item;
			left=right=null;	
		}		
	}
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
		
	}
}

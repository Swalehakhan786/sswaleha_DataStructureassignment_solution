package com.greatlearning.bst;

public class BinarySearchTree {

		/* Class containing left
		and right child of current node
		* and key value*/
		class Node {
			int key;
			Node left, right;

			public Node(int item)
			{
				key = item;
				left = right = null;
			}
		}

		// Root of BST
		Node root;

		// Constructor
		BinarySearchTree() { root = null; }

		BinarySearchTree(int value) { root = new Node(value); }

		// This method mainly calls insertRec()
		void insert(int key) { root = insertRec(root, key); }

		/*  recursive function to
		insert a new key in BST */
		Node insertRec(Node root, int key)
		{

			/* If the tree is empty,
			return a new node */
			if (root == null) {
				root = new Node(key);
				return root;
			}

			/* Otherwise, recur down the tree */
			if (key < root.key)
				root.left = insertRec(root.left, key);
			else if (key > root.key)
				root.right = insertRec(root.right, key);

			return root;
		}

		// This method mainly calls InorderRec()
		void inorder() { inorderRec(root); }

		//  inorder traversal of BST
		void inorderRec(Node root)
		{
			if (root != null) {
				inorderRec(root.left);
				System.out.println(root.key);
				inorderRec(root.right);

			}
		}

		// Driver Code
		public static void main(String[] args)
		{
			BinarySearchTree tree = new BinarySearchTree();

			/* Let us create following BST
				50
			  /	 \
			30	 60
			/    / 
        	10  55  */
			tree.insert(50);
			tree.insert(30);
			tree.insert(60);
			tree.insert(10);
			tree.insert(55);

			// print inorder traversal of the BST
			tree.inorder();
		}
	}
	




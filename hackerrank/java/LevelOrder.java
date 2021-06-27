import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i);
        }
      
    }
    public static int height(Node root) {
        if (root == null) {
           return 0;
        } else {
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            if (lheight > rheight) {
                return(lheight+1);
            }
            else return(rheight+1); 
        }
    }
    public static void printGivenLevel (Node root ,int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }

	public static Node insert(Node root, int data) {
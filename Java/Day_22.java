import java.util.*;
import java.io.*;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    public static int getHeight(Node root) {
        // Write your code here
        int maxHeight = 0;
        int tempHeight = 0;
        //Node parent = root;
        //boolean leftIsHigher = false;
        Node current = root;
        if (root == null)
            return 0;
        else {
            if(current.left != null || current.right != null){
                tempHeight = 1 + getHeight(current.left);
                if(maxHeight < tempHeight){
                    maxHeight = tempHeight;
                }
                tempHeight = 1 + getHeight(current.right);
                if(maxHeight < tempHeight){
                    maxHeight = tempHeight;
                }
            }
        }
        return maxHeight;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
        sc.close();
    }
}
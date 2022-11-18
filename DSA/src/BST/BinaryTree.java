package BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node {
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class BinaryTree {

    /* This class covers the following topics:
    1. All 3 types of traversals
    2. Constructing a BST from an array
    3. Constructing a balanced BST from an unbalanced BST.
     */
    Node root;
    List<Integer> result = new ArrayList<Integer>();
    public void inorderTraversal(Node node){
        if(node == null)
            return;
        inorderTraversal(node.left);
        result.add(node.data);
        System.out.println(node.data);
        inorderTraversal(node.right);
    }

    public void preorderTraversal(Node node){
        if(node == null)
            return;
        System.out.println(node.data);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public void postOrderTraversal(Node node){
        if(node == null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);

    }

    public Node createBSTFromSortedArray(int[] arr, int start, int end){
        if(start > end){
            return null;
        }
        int i = (start+end)/2;
        int mid = arr[i];
        Node node = new Node(mid);
        node.left = createBSTFromSortedArray(arr, start, i-1);
        node.right = createBSTFromSortedArray(arr,i + 1, end);
        return node;
    }

    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
//        Uncomment below lines for printing tree traversals
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//        System.out.println("Post-order Traversal");
//        tree.postOrderTraversal(tree.root);

//        Unbalanced BST to balanced BST
        /*
        Steps to convert an unbalanced BST to BST:
        1. Construct an array from the unbalanced tree by traversing inorder
        2. Create a BST from the sorted array from step 1
        3. Print the BST in preorder
         */
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(7);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.left.left = new Node(5);

        System.out.println("--- Inorder Traversal --- ");
        tree.inorderTraversal(tree.root);
        int[] arr = tree.result.stream().mapToInt(Integer::intValue).toArray();
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        tree.root = tree.createBSTFromSortedArray(arr, 0, arr.length-1);
        System.out.println("--- Balanced BST / Preorder Traversal ---");
        tree.preorderTraversal(tree.root);
    }
}

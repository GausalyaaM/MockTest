package com.company.mocktest;
import java.util.Scanner;
public class TrimBst {
    class Node{
        int key;
        Node left,right;
        public Node(int data) {
            key = data;
            left = right = null;
        }
        }
        Node root;
    public Node insert(Node root,int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else {
            if (key <= root.key) {
                root.left = insert(root.left, key);
            } else {
                root.right = insert(root.right, key);
            }
        }
        return root;
    }
    void inOrderRec(Node root){
        if(root!=null) {
            inOrderRec(root.left);
            System.out.println(root.key);
            inOrderRec(root.right);
        }
        }
        static Node remove(Node root,int node1,int node2) {
            if (root == null) {
                return null;
            }
            root.left = remove(root.left, node1, node2);
            root.right = remove(root.right, node1, node2);
            if (root.key < node1) {
                Node rightChild = root.right;
                root = null;
                return rightChild;
            }
            if (root.key > node2) {
                Node leftChild = root.left;
                root = null;
                return leftChild;
            }
            return root;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            TrimBst tree = new TrimBst();
            System.out.println("Enter the no.of elements");
            int num = sc.nextInt();
            Node root = null;
            System.out.println("Enter the elements:");
            for (int i = 0; i < num; i++) {
                root = tree.insert(root, sc.nextInt());
            }
            //tree.inOrderRec(root);
            System.out.println("Enter the value of node1");
            int node1 = sc.nextInt();
            System.out.println("Enter the vaue of node2");
            int node2 = sc.nextInt();
            root = remove(root,node1,node2);
            tree.inOrderRec(root);
        }
    }

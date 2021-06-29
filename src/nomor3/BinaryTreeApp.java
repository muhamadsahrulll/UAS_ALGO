/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor3;

/**
 *
 * @author Sahrul
 */
public class BinaryTreeApp {
    public static void main (String[]args){
        BinaryTree tree = new BinaryTree();
        TreeNode node;
        
        node = new TreeNode(30);
        tree.insert(node);
        
        node = new TreeNode(40);
        tree.insert(node);
        
        node = new TreeNode(50);
        tree.insert(node);
        
        node = new TreeNode(60);
        tree.insert(node);
        
        node = new TreeNode(80);
        tree.insert(node);
        
        System.out.println("Transversal Dengan Inorder");
        tree.inOrder();
        System.out.println();
        
        System.out.println("Transversal dengan preorder");
        tree.preOrder();
        System.out.println();
        
        System.out.println("Transversal dengan postOrder : ");
        tree.postOrder();
        System.out.println();
        
        System.out.println("Muhamad Sahrul Syabani 20090056");
        
        
    }
    
}

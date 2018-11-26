/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_week6;

/**
 *
 * @author leung
 */
public class Coursework_week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data = 0;
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Inserting :");
        for (int i = 1; i <= 10; i++) {
            data = (int) (i*100);
            System.out.print(data + " ");
            tree.insert(data);
        }
        System.out.println();
        tree.inorder();
        tree.delete(400); 
        tree.inorder();
    }

}

package org.example.trees;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
       val = x;
       left=null;
       right=null;
    }
}

public class InorderTraversal {

    public static void main(String[] args) {
        /*
        Example Input

            Input 1:

               1
                \
                 2
                /
               3
            Input 2:

               1
              / \
             6   2
                /
               3


            Example Output

            Output 1:

             [1, 3, 2]
            Output 2:

             [6, 1, 3, 2]
         */
    }

    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> list = new ArrayList<>();
        inorder(A, list);

        return list;
    }

    public void inorder(TreeNode A, ArrayList list){

        if(A == null)
            return;

        inorder(A.left, list);
        list.add(A.val);
        inorder(A.right, list);
    }
}


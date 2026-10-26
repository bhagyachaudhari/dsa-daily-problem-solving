package org.example.trie;

public class ShortestPrefix {

    public static void main(String[] args) {


        /*

        Example Input

        Input 1:

         A = ["zebra", "dog", "duck", "dove"]
        Input 2:

        A = ["apple", "ball", "cat"]


        Example Output

        Output 1:

         ["z", "dog", "du", "dov"]
        Output 2:

         ["a", "b", "c"]

         */
    }

    public String[] prefix(String[] A) {
        Node root = new Node('#');
        Node curr = null;
        for(int k = 0; k < A.length; k++){
            curr = root;
            String word = A[k];
            int len = word.length();
            for(int i = 0; i < len; i++){
                int idx = word.charAt(i) - 97;
                if(curr.children[idx] == null){
                    curr.children[idx] = new Node(word.charAt(i));
                }
                curr.children[idx].count++;
                curr = curr.children[idx];
            }
        }

        String[] res = new String[A.length];
        for(int k = 0; k < A.length; k++){
            curr =  root;
            String word = A[k];
            int len = word.length();
            StringBuilder prefix = new StringBuilder();
            for(int i = 0; i < len; i++){
                int idx = word.charAt(i) - 97;
                curr = curr.children[idx];
                if(curr.count == 1){
                    prefix.append(word.charAt(i));
                    res[k] = prefix.toString();
                    break;
                }else{
                    prefix.append(word.charAt(i));
                }
            }
        }
        return res;
    }
}

class Node{
    char data;
    Node[] children = new Node[26];
    int count;
    Node(char ch){
        data = ch;
        for(int i = 0; i < 26; i++){
            children[i] = null;
        }
        count = 0;
    }
}


package org.example.linkedlist;


class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
}

public class InsertInLL {
    public static void main(String[] args) {

           /*
                Example Input

                Input 1:
                A = 1 -> 2
                B = 3
                C = 0
                Input 2:
                A = 1 -> 2
                B = 3
                C = 1


                Example Output

                Output 1:
                3 -> 1 -> 2
                Output 2:
                1 -> 3 -> 2

            */
    }

    public ListNode solve(ListNode A, int B, int C) {
        int size = 0;
        ListNode l = A;
        ListNode newNode = new ListNode(B);

        while(l != null){
            size++;
            l = l.next;
        }

        if(C >= size){
            l = A;
            while(l.next != null){
                l = l.next;
            }
            l.next = newNode;
        }else if(C == 0){
            newNode.next = A;
            A = newNode;
        }else{
            l = A;
            for(int i = 0; i < size; i++){
                if(i == (C - 1)){
                    newNode.next = l.next;
                    l.next = newNode;
                    break;
                }
                l = l.next;
            }
        }

        return A;
    }
}


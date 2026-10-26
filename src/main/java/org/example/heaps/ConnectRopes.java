package org.example.heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ConnectRopes {

    public static void main(String[] args) {
        /*
        Example Input

            Input 1:

             A = [1, 2, 3, 4, 5]
            Input 2:

             A = [5, 17, 100, 11]


            Example Output

            Output 1:

             33
            Output 2:

             182

        */


    }

    public int solve(ArrayList<Integer> A) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int cost = 0;

        for(int i = 0; i < A.size(); i++){
            minHeap.add(A.get(i));
        }


        while(minHeap.size() > 1){
            int ropeVal = minHeap.poll() + minHeap.poll();
            minHeap.add(ropeVal);
            cost = cost + ropeVal;
        }

        return cost;
    }
}

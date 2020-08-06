package com.data_structures_algorithms;

import com.data_structures_algorithms.queue.QueueMain;
import com.data_structures_algorithms.recursion.RecursionMain;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /**
         * Recursion.
         */
        RecursionMain recursionMain = new RecursionMain();
//        recursionMain.recursionCall();


        /**
         * Queue Data structure.
         */
        QueueMain queueByArray = new QueueMain();
        queueByArray.queueForArray();

    }
}

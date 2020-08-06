package com.data_structures_algorithms.queue;

public class QueueMain {

    public void queueForArray() {
        System.out.println("Creating an empty queue...");
        QueueByArray queueByArray = new QueueByArray(5);

        System.out.println("Enqueuing 6 values in the queue...");
        for (int i = 0; i <= 6; i++) {
            queueByArray.enQueue(i);
        }

        System.out.println("Peek value from queue...");
        queueByArray.peekOperation();

        System.out.println("Dequeue 6 values from queue...");
        for (int i = 0; i <= 5; i++) {
            queueByArray.deQueue();
        }

        System.out.println("Deleting the entire Queue...");
        queueByArray.deleteQueue();

    }
}

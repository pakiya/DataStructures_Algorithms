package com.data_structures_algorithms.queue;

public class QueueByArray {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueByArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Successfully created an empty queue of size: " + size);
    }

    public void enQueue(int value) {
        if (isQueueFull()) {
            System.out.println("Queue overflow error!!");
        } else if (isQueueEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
        printQueue();
    }

    public void printQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty !");
        } else {
            System.out.println("Queue now ...");
            for (int i = beginningOfQueue; i <= topOfQueue; i++) {
                System.out.println(arr[i] + "   ");
            }
            System.out.println();
        }
    }

    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue underflow error!!");
        } else {
            System.out.println("Dequeing value from Queue...");
            System.out.println("Dequeued: " + arr[beginningOfQueue] + " from queue");
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            printQueue();
            System.out.println();
        }
    }

    public boolean isQueueEmpty() {
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) return true;
        else return false;
    }

    public boolean isQueueFull() {
        if (topOfQueue == arr.length - 1) return true;
        else return false;
    }

    public void peekOperation() {
        if (isQueueEmpty()) {
            System.out.println("The queue is empty!!");
        } else {
            System.out.println(arr[beginningOfQueue]);
        }
    }

    public void deleteQueue(){
        arr= null;
        System.out.println("Queue is successfully deleted !");
    }


}

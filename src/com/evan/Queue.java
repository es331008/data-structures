package com.evan;

import java.util.Arrays;

public class Queue {
    private int size;
    private int first = 0;
    private int last = 0;
    private int[] array;

    public Queue(int size) {
        this.size = size;
        array = new int[size];
    }

    public void enqueue(int i) {
        if (last == size) {
            System.out.println("Queue is full");
        } else {
            array[last] = i;
            last++;
        }
    }

    public void dequeue() {
        if (last == first) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < last - 1; i++) {
                array[i] = array[i + 1];
            }
            array[last-1] = 0;
            last--;
        }
    }

    public int top() {
        return array[first];
    }

    public void printQueue() {
        Arrays.stream(array).asLongStream().forEach(System.out::print);
        System.out.println();
    }
}

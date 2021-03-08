package com.evan;

public class Main {
    public static void main(String[] args) {
        System.out.println("***STACK EXAMPLE***");
        System.out.println("Initializing new stack of size 5");
        Stack stack = new Stack(5);
        System.out.println("Pushing numbers 1 to 5");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Current top of stack: " + stack.peek());
        int pop = stack.pop();
        System.out.println("Popped value: " + pop);
        System.out.println("Current top of stack: " + stack.peek());
        System.out.println("Pushing 10");
        stack.push(10);
        System.out.println("Current top of stack: " + stack.peek());

        System.out.println("\n***QUEUE EXAMPLE***");
        System.out.println("Initializing new queue of size 4");
        Queue queue = new Queue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.printQueue();
        System.out.println("Dequeue one element");
        queue.dequeue();
        queue.printQueue();
        System.out.println("Enqueue one element");
        queue.enqueue(1);
        queue.printQueue();

        System.out.println("\n***LINKED LIST EXAMPLE***");
    }
}

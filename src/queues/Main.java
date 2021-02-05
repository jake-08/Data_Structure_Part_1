package queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.dequeue();
        System.out.println(queue.toString());


    }
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack();
        while(!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}

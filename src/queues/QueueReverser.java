package queues;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    public static void reverse(Queue<Integer> queue, int k) {
        if (k < 0 || k > queue.size())
            throw new IllegalStateException();

        // Q [10, 20, 30, 40, 50] k = 3
        Stack<Integer> stack = new Stack<>();
        // Add 0 to k elements to stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        // Q [40, 50]
        // S [10, 20, 30]
        // Add elements back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        // Q [40, 50, 10, 20, 30]
        // S []
        // Move the first two elements in queue to the back
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }

    }
}

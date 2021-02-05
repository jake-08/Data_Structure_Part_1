package queues;

import java.util.ArrayList;

public class LinkedListQueue {

    private class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count;

    // O(1)
    public void enqueue(int item) {
        Node node = new Node(item);
        if (count == 0) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        count ++;
    }

    // O(1)
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        int item;
        if (last == first) {
            item = first.value;
            last = first = null;
        } else {
            item = first.value;
            var second = first.next;
            first.next = null;
            first = second;
        }

        count --;

        return item;
    }

    // O(1)
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return first.value;
    }

    // O(1)
    public boolean isEmpty() {
        return first == null;
    }

    // O(1)
    public int size() {
        return count;
    }

    // O(n)
    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();

        Node current = first;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list.toString();
    }
}

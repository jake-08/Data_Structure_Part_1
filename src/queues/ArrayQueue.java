package queues;

import java.util.Arrays;

public class ArrayQueue {
    // (ArrayDeque)
    // enqueue
    // dequeue
    // peek
    // isEmpty
    // isFull
    // [10, 20, 30, 40, 0]
    //   L           F
    // F = 0;
    // R = 3;
    private int[] items;
    private int counter;
    private int first;
    private int last;

    public ArrayQueue(int length) {
        items = new int[length];
        first = last = 0;
    }

    public void enqueue(int item) {
        if(isFull())
            throw new IllegalStateException();

        items[last] = item;
        last = (last + 1) % items.length;
        counter++;
    }

    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();

        var item = items[first];
        items[first] = 0;
        first = (first + 1) % items.length;
        counter--;

        return item;
    }

    public int peek() {
        if(isEmpty())
            throw new IllegalStateException();

        return items[first];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == items.length;
    }

    public void print() {
        System.out.println("Empty: " + isEmpty());
        System.out.println("Full: " + isFull());
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}

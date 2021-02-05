package stacks;

import java.util.Arrays;

public class TwoStacks {

    // Implement two stacks in one array. Make sure your implementation is space efficient. Do not allocate the same
    // amount of space by dividing the array in half.

    private int[] items;
    private int count1;
    private int count2;

    public TwoStacks(int length) {
        if (length <= 0)
            throw new IllegalStateException("length must be greater than 1");

        items = new int[length];
        count1 = -1;
        count2 = length;
    }

    public void push1(int item) {
        if (isFull1())
            throw new IllegalStateException();
        items[++count1] = item;
    }

    public void push2(int item) {
        if (isFull2())
            throw new IllegalStateException();
        items[--count2] = item;
    }

    public int pop1() {
        if (isEmpty1()) {
            throw new IllegalStateException();
        }
        return items[count1--];
    }

    public int pop2() {
        if (isEmpty2()) {
            throw new IllegalStateException();
        }
        return items[count2++];
    }

    public String print1() {
        var array1 = Arrays.copyOfRange(items, 0, count1 + 1);
        return Arrays.toString(array1);
    }

    public String print2() {
        var array2 = Arrays.copyOfRange(items, count2 , items.length);
        return Arrays.toString(array2);
    }

    public boolean isEmpty1() {
        return count1 == -1;
    }

    public boolean isEmpty2() {
        return count2 == items.length;
    }

    public boolean isFull1() {
        return count1 + 1 == items.length;
    }

    public boolean isFull2() {
        return count2 - 1 == count1;
    }

    public int count1(){
        return count1;
    }

    public int count2(){ return items.length - count2; }



}

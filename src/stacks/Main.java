package stacks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] items = new int[5];
//        items[0] = 1;
//        items[1] = 2;
//        items[2] = 3;
//        items[3] = 4;
//        items[4] = 5;
//        var array2 = Arrays.copyOfRange(items, 0 , 1);
//        System.out.println(Arrays.toString(array2));


//        TwoStacks twoStacks = new TwoStacks(1);
//        twoStacks.push1(10);
//        twoStacks.push1(10);
//        twoStacks.push2(20);
//        twoStacks.push2(20);
//        twoStacks.push2(20);
//        twoStacks.pop2();
//        twoStacks.pop2();
//        twoStacks.pop2();
//        twoStacks.push2(30);
//        twoStacks.push1(20);
//        twoStacks.push2(30);
//        twoStacks.pop2();
//        twoStacks.pop2();
//        System.out.println("Stack 1: " + twoStacks.print1());
//        System.out.println("Stack 2: " + twoStacks.print2());
//        System.out.println("Count 1: " + twoStacks.count1());
//        System.out.println("Count 2: " + twoStacks.count2());
//        System.out.println("Stack 1: " + twoStacks.isEmpty1());
//        System.out.println("Stack 2: " + twoStacks.isEmpty2());

        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(3);
        minStack.push(2);
        minStack.push(0);
        System.out.println(minStack.min());
        minStack.print();




    }
}

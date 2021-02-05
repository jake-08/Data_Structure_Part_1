package array;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;
    public Array(int length){
        items = new int[length];
    }
    public void print(){
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int number){
        if(count == items.length){
            int[] newArray = new int[count * 2];
            for(int i = 0; i < count; i++){
                newArray[i] = items[i];
            }
            items = newArray;
        }
        items[count++] = number;
    }
    public void removeAt(int index){
        if(index < 0 || index > count){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i = index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }
    public int indexOf(int number){
        for(int i = 0; i < count; i++){
            if(items[i] == number){
                return i;
            }
        }
        return -1;
    }
    public Array intersect(Array otherItems){
        Array intersectItems = new Array(count);
        for(int i = 0; i < count; i++){
            if(otherItems.indexOf(items[i]) >= 0){
                intersectItems.insert(items[i]);
            }
        }
        return intersectItems;
    }
    public int max(){
        int max = 0;
        for(int i = 0; i < count; i++){
            if(items[i] > max){
                max = items[i];
            }
        }
        return max;
    }
    public void reverse(){
        for (int i = 0; i < count; i++){
            System.out.println(items[count - i - 1]);
        }
    }
    public void insertAt(int item, int index){
        if(index < 0 || index >= count){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(count == items.length){
            int[] newArray = new int[count * 2];
            for(int i = 0; i < count; i++){
                newArray[i] = items[i];
            }
            items = newArray;
        }
        for(int i = count - 1; i >= index; i--){
            items[i + 1] = items[i];
        }
        items[index] = item;
        count++;
    }

}

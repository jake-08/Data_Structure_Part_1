package array;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);

        Array numbers2 = new Array(5);
        numbers2.insert(3);
        numbers2.insert(1);
        numbers2.insert(2);

        Array intersectNumbers = numbers2.intersect(numbers);
//        intersectNumbers.print();

//        numbers2.reverse();
        numbers.insertAt(1,2);
        numbers.print();


    }
}

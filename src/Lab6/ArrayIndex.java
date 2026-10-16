package Lab6;

public class ArrayIndex {

    void main() {

    /*
    Exercise 6.2: Array index
    Explain the error and correct the loop condition.

    int[] numbers = {10, 20, 30};

for (int i = 0; i <= numbers.length; i++) {
        System.out.println(numbers[i]);
    }
   */

        // The error happens because the loop goes beyond the last position of the array.
        // I changed <= to < to stop the loop at the correct position.

        int[] numbers = {10, 20, 30};

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
    }


}




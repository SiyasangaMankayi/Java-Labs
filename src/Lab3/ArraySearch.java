package Lab3;

public class ArraySearch {

    int[] numbers = {10,30,20,50,40};

    public void Start(){
        int target = 100;
        boolean found = false;

                for (int i = 0; i < numbers.length;i++)
                if (numbers[i] == target) {
                    System.out.println(i);
                    found = true;
                }
        if (found ==false) {

            System.out.println("Value not found");

    }

    }
}


package Lab3;

public class ArrayStatistics {
    int[] statistics = {20,10,40,80,30};

   public void Start(){
        int greater50 = statistics[0];
        int less50 = statistics[0];
        int count = 0;

        for (int i =0;i<statistics.length;i++) {
            if (statistics[i] > greater50) {

    greater50 = statistics[i];
            }

            if(statistics[i]< less50){
            less50 = statistics[i];
            }
            if (statistics[i]>=50)
            count = count +1;


        }
       System.out.println("Largest value is: " + greater50);
       System.out.println("Smallest value is " + less50);
       System.out.println("Number of Elements: " + statistics.length);
       System.out.println("Values >= 50: " + count);


    }

}
package Lab3;

public class StudentMarks {
    int [] mark = {20,30,40,50,60};
    int total = 0;

    public void display() {

        for(int i = 0; i < mark.length;i++) {

        System.out.println(mark[i]);
        total = total + mark[i];
        }

        double average = total/5;
        System.out.println(total);
        System.out.println("Average is " + average);

    }

}

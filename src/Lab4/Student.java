package Lab4;

public class Student {
    String name;
    String studentNumber;
    double mark;


    public Student(String name, String studentNumber, double mark) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    public void displayDetails() {
        System.out.println(name);
        System.out.println(studentNumber);
        System.out.println(mark);

    }

    public boolean hasPassed() {
        boolean passed = false;

        if (mark >= 50) {
            passed = true;
        }

        return passed;
    }
}
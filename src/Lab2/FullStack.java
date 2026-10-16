package Lab2;

public class FullStack {
    String name;
    int age;
    String gender;
    boolean isEmployed;

    public FullStack(String name, int age, String gender, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;

    }

    public void DisplayDetails() {
        System.out.println(this.name+" " +this.age + " "+this.gender+" "+ this.isEmployed);

    }
}


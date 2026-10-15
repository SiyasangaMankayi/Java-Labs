package Lab4;

public class StudentMain {
  void main() {
      Student student1 = new Student("Say","7645", 11);
      Student student2 = new Student ("Syk", "IT100", 86);

      student1.displayDetails();
      System.out.println(student1.hasPassed());

      student2.displayDetails();
      System.out.println(student2.hasPassed());

  }



}

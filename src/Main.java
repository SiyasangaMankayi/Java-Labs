import Lab2.LoginCheck;
import Lab3.ArraySearch;
import Lab3.ArrayStatistics;
import Lab3.StudentMarks;

public class Main {
   void main() {

    LoginCheck login = new LoginCheck();
    login.loginDetails(); // LoginCheck

    StudentMarks studentMark = new StudentMarks();
    studentMark.display();
    ArrayStatistics statistics = new ArrayStatistics();
    statistics.Start();
    ArraySearch search = new ArraySearch();
    search.Start();
  }
}



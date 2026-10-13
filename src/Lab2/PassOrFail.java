package Lab2;

public class PassOrFail {

    public String checkResult(int mark) {

        if (mark < 0 || mark > 100) {
            return "Invalid mark";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

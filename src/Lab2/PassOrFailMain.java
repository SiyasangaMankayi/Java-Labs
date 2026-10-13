package Lab2;

import java.util.Scanner;

public class PassOrFailMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PassOrFail resultChecker = new PassOrFail();

        System.out.print("Enter your mark: ");
        int mark = input.nextInt();

        String result = resultChecker.checkResult(mark);

        System.out.println("Result: " + result);
    }
}

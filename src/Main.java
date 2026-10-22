package Part_1;

public class Main {
    public void main() {
        ResultsCalc calculate = new ResultsCalc();

        System.out.println(calculate.CalcResult(0));
        System.out.println(calculate.CalcResult(49));
        System.out.println(calculate.CalcResult(50));
        System.out.println(calculate.CalcResult(74));
        System.out.println(calculate.CalcResult(75));
        System.out.println(calculate.CalcResult(100));
        System.out.println(calculate.CalcResult(-1));
        System.out.println(calculate.CalcResult(101));
/*
Tasks
Declare the enum.
In a separate method, use if / else if / else to determine the status from a score.
Test the boundary values 0, 49, 50, 74, 75, and 100.
Explain what should happen if the score is -1 or 101.

Think about: An enum limits a variable to a known set of values.
Why is that safer than storing status as any text string?

Answer
1.
2.
3.
4. If the score is -1 or 101, return INVALID because the score must be between 0 and 100.

- Because an enum only allows set values, so you avoid spelling mistakes and wrong statuses.
 */

    }
    }

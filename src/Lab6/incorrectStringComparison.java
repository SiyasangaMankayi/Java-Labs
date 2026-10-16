package Lab6;

public class incorrectStringComparison {
    void main() {
        cd "C:\Users\JAVA 19-07\Documents\Java Labs"
        git status
        git add src/Lab6/incorrectStringComparison.java
        git commit -m "Complete String comparison exercise"
        git push
    /*
    Explain why the following code may print Different text, then correct it to compare String contents.

    String first = new String("Java");
    String second = new String("Java");

if (first == second) {
        System.out.println("Same text");
    } else {
        System.out.println("Different text");
    }
    1. Explanation:
       -The code prints "Different text" because == compares the objects, not the text inside them.
       -We use equals() to compare the actual text.

*/
    // Fixed code:
    String first = new String("Java");
    String second = new String("Java");

    if (first.equals(second)) {

        System.out.println("Same text");}

    else {
        System.out.println("Different text");
    }
}
}

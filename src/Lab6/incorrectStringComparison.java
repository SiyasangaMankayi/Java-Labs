package Lab6;

public class incorrectStringComparison {
    void main() {
        
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

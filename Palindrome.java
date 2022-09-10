// Name:        Nicolas Federico
// Class:       CS 3305 / W04
// Term:        Fall 2022
// Instructor:  Sharon Perry
// Assignment:  04-Part-2-Palindromes

import static java.lang.System.out;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        // Scanner object to read and save user input into variable
        Scanner scan = new Scanner(System.in);

        // Declare from internal java Stack object
        Stack<String> Stack_1 = new Stack<>();
        Stack<String> Stack_2 = new Stack<>();
        Stack<String> Stack_3 = new Stack<>();

        out.print("Enter text to check if palindrome: ");
        String text = scan.nextLine(); // scan the user's inuput
        String[] arr = text.split(""); // convert input into array

        // for loop iterates through every letter of the user input
        // and creates two identical stacks and the tops are the
        // end of the input text
        for (int i = 0; i < arr.length; i++) {
            Stack_1.push(arr[i]);
            Stack_2.push(arr[i]);
        }

        // inverts the contents of Stack_1 onto Stack_3
        // makes Stack_3 read the text in the opposite direction as Stack_2
        while (!Stack_1.empty()) { // terminates when Stack_1 is empty
            // removes end of Stack_1 and pushes onto Stack_3
            Stack_3.push(Stack_1.pop());
        }

        // if stacks are equivalent, the text reads the same forwards and backwards
        if (Stack_2.equals(Stack_3)) {
            out.println("The entered string is a palindrome.");
        } else {
            out.println("The entered string is not a palindrome.");
        }

        scan.close();
    }
}

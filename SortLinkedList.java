/**
 * CSC6301_LinkedList_Project4_SopheaSann-Rorth
 * Instructions:
 * Implement a program that reads a list of Integer numbers from the scanned input and saves 
 * them into a Linked List sorted from the smallest to the largest. Be sure to use the 
 * Collections Framework and follow code guidelines and document your code accordingly;

 * Please make sure your program can be run on the command line and does NOT need an IDE to run.
 * Please mention the command that needs to be run to invoke your program. Lastly, 
 * make sure you list the javadoc command to be used to generate javadoc
 */

/**
 * Import modules for LinkedList and Scanner to handle inputs.
 * These imports are good examples for reuse codes. They are pre-written.
 *  -java.util.LinkedList;
 *  -java.util.Scanner;
 * The are reusable; They reduce errors and are efficient.
 */
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Define class to sort a list of user's input into a Linked List, print out the input list, and 
 * print out Sorted LinkedList.The main method will continuously take user's input until user's 
 * use the break command. The methods will take inputs, insert them into the list, sort and insert into 
 * the Linked List according the values from least to greatest using indexing. Invalid input will 
 * loop user back for more inputs or until user type in "Finish" and hit enter: The program will run 
 * until the it prints out the final Sorted Linked List or user input "Finish."
 * @author Sophea Sann-Rorth
 * @version 1.0.0
 * @since week 4 of CSC6301
 */


public class SortLinkedList {
    /**
     * Contains the constructor for the LinkedList.
     * Main method implements "while" loop to continuously take user's inputs until user input "Finish".
     * It will loop back to ask for user input if the input is invalid. Organize all inputs into a list.
     * List will be sorted and insert into Linked List. Inital input will be printed, along with final 
     * sorted Linked List.
     * @since week 4 of CSC6301
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create LinkedList to store integers input.
        // Constructor as defined by Java Collections Framework
        LinkedList<Integer> sortList = new LinkedList<>();

        System.out.println("Please enter integers separated by space, when done entering the number, put a space and then type 'Finish', and hit enter:");

        // Continuously takes input, separated by space, from user until user types in "Finish":
        // sc.hasNext checks for more input.
        while (sc.hasNext()) {
            // if there is more input, append it into the list
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                // Insert the user's input into list.
                insertSort(sortList, num);
            } else if (sc.hasNext("Finish")) {
                break; // Type in "Finish" to exit.
            } else {
                System.out.println("Invalid input. Please enter an integer, separated by a space; To exit, put a space after last input, then type in 'Finish', and hit enter.");
                sc.next(); // Process invalid input
            }
        }
        // Print out the sorted Linked List.
        System.out.println(" The Sorted Linked List: " + sortList);
        sc.close(); //end user input module
    }
    /**
     * The method will insert a number(s) into the Linked List and sort, using indexing.
     * @param the input (value) number to be inserted into the Linked List.
     * @param list the Linked list to that will be used for Insertion.
     */

    private static void insertSort(LinkedList<Integer> list, int value) {
        int index = 0; // index starts at 0
        while (index < list.size() && list.get(index) < value) {
            index++;
        }
        // Insert the input value at the index/correct position
        // list.add is part of Java collections Framework for add the number according to index and value.
        list.add(index, value);
    }
}
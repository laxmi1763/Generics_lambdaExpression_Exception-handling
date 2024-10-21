/*
 * Author: Laxmi Chari
 * Roll no: 22
 * Title: Java program to implement Generic classes, Lambda Expressions and Handles Exceptions
 * Start Date: 21/10/2024
 * Modified Date: 21/10/2024
 * Description: This is the main driver class where the Stack program will be excuted 
 */

package assignemnt7;

import java.util.Scanner;

//Main class to interact with the stack
public class StartStack {

 // Entry point of the program
 public static void main(String[] args) {
     // Create a Scanner object to read input from the user
     Scanner sc = new Scanner(System.in);

     // Prompt the user to enter the size of the stack
     System.out.println("Enter the size:");
     int n = sc.nextInt();  // Read the stack size from the user

     // Create an array of Integers with the specified size and pass it to the Stack constructor
     Integer[] a = new Integer[n];
     Stack<Integer> s = new Stack<>(a);  // Create a stack for Integer elements

     // Variable to store the user's menu choice
     int c = 0;

     // Start a loop to display the menu and accept user input until the user exits
     do {
         // Display the menu of available options
         System.out.println("Enter:\n1:push\n2:pop\n3:display\n4:top-position\n0:exit");
         c = sc.nextInt();  // Read the user's choice
         switch (c) {  // Switch based on the user's choice

             // Case 1: Push an element onto the stack
             case 1:
                 System.out.println("Enter element to push:");  // Prompt user for the element
                 int w = sc.nextInt();  // Read the element to push
                 try {
                     // Attempt to push the element onto the stack
                     s.push(w);
                     System.out.println("Inserted");
                 } catch (StackException e) {
                     // Handle stack overflow or other stack-related issues
                     System.out.println(e.getMessage());
                 }
                 break;

             // Case 2: Pop an element from the stack
             case 2:
                 try {
                     // Attempt to pop the top element from the stack
                     System.out.println("The popped element is " + s.pop());
                 } catch (StackException e) {
                     // Handle the case where the stack is empty
                     System.out.println(e.getMessage());
                 }
                 break;

             // Case 3: Display all elements in the stack
             case 3:
                 // Check if the stack is empty
                 if (s.empty())
                     System.out.println("Empty");  // Print message if stack is empty
                 else
                     s.display();  // Use the lambda expression to display all elements
                 break;

             // Case 4: Display the top element of the stack
             case 4:
                 try {
                     // Attempt to display the top element
                     System.out.println("Top element is: " + s.stacktop());
                 } catch (StackException e) {
                     // Handle the case where the stack is empty
                     System.out.println(e.getMessage());
                 }
                 break;

             // Default case: Handle invalid input
             default:
                 System.out.println("Wrong input! Retry");
         }

     } while (c != 0);  // Continue looping until the user chooses to exit (i.e., presses 0)

     // Close the scanner object to prevent resource leaks
     sc.close();
 }
}

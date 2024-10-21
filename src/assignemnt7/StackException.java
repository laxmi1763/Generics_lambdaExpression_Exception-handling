/*
 * Author: Laxmi Chari
 * Roll no: 22
 * Title: Java program to implement Generic classes, Lambda Expressions and Handles Exception
 * Start Date: 21/10/2024
 * Modified Date: 21/10/2024
 * Description: Custom exception class to handle both stack overflow and empty stack cases
 */

package assignemnt7;

//Custom exception class to handle both stack overflow and empty stack cases
public class StackException extends RuntimeException {
 
 // Constructor that accepts a message
 public StackException(String message) {
     super(message);  // Call the parent RuntimeException constructor with the message
 }

 // Static method to create a StackOverflowException
 public static StackException stackOverflow() {
     return new StackException("Stack overflow!");  // Return an instance with the specific message
 }

 // Static method to create an EmptyStackException
 public static StackException emptyStack() {
     return new StackException("Stack is empty!");  // Return an instance with the specific message
 }
}


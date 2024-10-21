/*
 * Author: Laxmi Chari
 * Roll no: 22
 * Title: Java program to implement Generic classes, Lambda Expressions and Handles Exceptions
 * Start Date: 21/10/2024
 * Modified Date: 21/10/2024
 * Description: This class defines the various methods that are implemented in Stack Data Structure
 */

package assignemnt7;

import java.util.Arrays;

//Generic Stack class that can hold elements of any type T
public class Stack<T> {
 // Array to hold the elements of the stack
 T[] elements;
 // Variable to keep track of the top of the stack (index)
 int top;

 // Constructor to initialize the stack
 Stack(T[] elements) {
     // Assign the passed array to the stack's elements array
     this.elements = elements;
     // Initialize top to -1, indicating the stack is empty
     this.top = -1;
 }

 // Method to push an element onto the stack
 // Throws StackException if the stack is full
 void push(T e) throws StackException {
     // Check if the stack is full by comparing top with the last valid index
     if (this.top >= this.elements.length - 1)
         // If full, throw custom StackException for stack overflow
         throw StackException.stackOverflow();
     else
         // Otherwise, increment top and add the element to the new top position
         this.elements[++this.top] = e;
 }

 // Method to pop an element from the stack
 // Throws StackException if the stack is empty
 T pop() throws StackException {
     // Check if the stack is not empty
     if (!empty())
         // If not empty, return the element at the top and decrement top
         return elements[top--];
     else
         // If empty, throw custom StackException for empty stack
         throw StackException.emptyStack();
 }

 // Method to check if the stack is empty
 boolean empty() {
     // Return true if top is -1, meaning the stack is empty
     return top == -1;
 }

 // Method to get the top element of the stack without removing it
 // Throws StackException if the stack is empty
 T stacktop() throws StackException {
     // Check if the stack is not empty
     if (!empty())
         // If not empty, return the element at the top
         return elements[top];
     else
         // If empty, throw custom StackException for empty stack
         throw StackException.emptyStack();
 }

 // Method to display all elements in the stack
 // Uses a lambda expression to print each element
 void display() {
     // Print a message before displaying elements
     System.out.println("The elements in the Stack:");
     // Create a stream of the elements from index 0 to top and print each element
     Arrays.stream(elements, 0, top + 1).forEach(e -> System.out.print(e + " "));
     // Move to a new line after printing all elements
     System.out.println();
 }
}

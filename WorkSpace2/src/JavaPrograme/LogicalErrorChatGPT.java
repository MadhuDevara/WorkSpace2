/*
 * package TestingOne;
 * 
 * public class LogicalErrorChatGPT {
 * 
 * public static void main(String[]args) { int num1= 10; int num2= 20;
 * 
 * // Logical error: Using ">" instead of ">="
 * 
 * if (num1> num2) {
 * 
 * System.out.println("The number is :" + num1);
 * System.out.println("The number is:" + num1); } } }
 */

package JavaPrograme;

public class LogicalErrorChatGPT {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Corrected logical error and redundant output

        if (num1 >= num2) {
            System.out.println("The number is: " + num1);
            System.out.println("The number is: " + num2);
        } else {
            System.out.println("The number is: " + num2);
            System.out.println("The number is: " + num1);
        }
    }
}

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
       Scanner scanner = new Scanner(System.in);
        private int age;
        private int LOWER_BOUND = 14;
        private int getYoungerAge(int age){
            return Math.round(age/2+7);
        }
        private int getOlderAge(int age){
             return Math.round(age*2-7);
        }
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        scanner = new Scanner(System.in);
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    /**
     * This is the main event loop for our PDA program
     */
   public void runEventLoop() {
   while (true) {
       System.out.println("How old are you?");
       try {
           age = scanner.nextInt();
            if (age < LOWER_BOUND) {
                System.out.println(age+" is too young!!");
            } else {
                System.out.println("Computations go here");                
                }

           } catch (InputMismatchException error) {
               System.out.println("Please enter an integer");
            scanner.next();
           }
        System.out.println("the youngest you can date is"+getYoungerAge+"the oldest you can date is" +getOlderAge );
    }
}
 

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

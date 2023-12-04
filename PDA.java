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
    boolean  shouldContinue = true; 
    int MinAge = 0;
    int MaxAge = 0; 
    int age = 0;
    int LOWER_BOUND = 14;
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        scanner = new Scanner(System.in);
        // We don't need to do anything in the constructor for
        // our program.
    }
    
     public void getYoungerAge(int age){
        int MinAge = (int) Math.round((age/2.0)+7.0);
    }

    public void getOlderAge(int age){
        int MaxAge =(int) Math.round((age*2.0)-7.0);
    }


    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (shouldContinue) {
            System.out.println("How old are you?");
            System.out.println("Enter 0 to exit program");
            try {
                age = scanner.nextInt();
             if (age == 0){
                  shouldContinue = false;
             }
            if (age < LOWER_BOUND) {
                   System.out.println(age+" is too young!!");
               } else {
                   System.out.println("the youngest you can date is " + MinAge + " the oldest you can date is " + MaxAge);               
               }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
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

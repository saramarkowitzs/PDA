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
    private boolean  shouldContinue = true; 
    private int age = 0;
    private int LOWER_BOUND = 14;
    private int getYoungerAge(int age){
       return Math.round((age/2)+7);
    }
    private int getOlderAge(int age){
       return  Math.round((age-7)*2);
    }
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        scanner = new Scanner(System.in);
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
                 if (age < LOWER_BOUND && age !=0) {
                       System.out.println(age+" is too young!!");
                   } else if (age != 0){
                       System.out.println("the youngest you can date is " + getYoungerAge(age) + " the oldest you can date is " + getOlderAge(age));               
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

package factorialprogram; 

/**
  * @Author Name: Kimberly Golding
  * @Date: Jun 19, 2017
  * @Description: Program that will determine the factorial
  * values of integers starting with the number 1 and display all factorial 
  * values up to a user's input value
  */

//Imports
import java.math.BigInteger;
import java.util.Scanner;

//Begin Class FactorialProgram 
public class FactorialProgram {
    
    //Begin Main Method
    public static void main(String[] args) {

        //Declarations
        int choice = 0;
        int n = 0;
        String ans;

        //Create a new scanner object
        Scanner sc = new Scanner(System.in);

        //Welcome statement
        System.out.printf("Welcome to my factorial program!\nPlease choose from"
                + " the following:\n1. Run Program\n2. Exit Program\n: ");
        choice = sc.nextInt();
        System.out.printf("\nThis program will determine the factorial value of"
                + " positive integers.\n\n");

        //Switch statement
        switch (choice) {
            case 1: //Run Factorial Program

                //Begin Do-while loop for Factorial Program 
                do {
                    System.out.printf("The starting number is 1.\nPlease enter "
                            + "an ending integer value: ");
                    
                    //Declarations
                    n = sc.nextInt();
                    BigInteger fact = BigInteger.ONE;
                    
                    //Begin for loop to determine & output data
                    for (int i = 1; i <= n; i++) {
                        fact = fact.multiply(BigInteger.valueOf(i));
                        System.out.printf("%d! = %s\n", i, fact);
                    }

                    //Ask user whether or not to run program again
                    System.out.print("Run factorial program again? "
                            + "(Y for Yes, N for No): ");
                    ans = sc.next();

                    //End do-while loop for Factorial Program
                } while (ans.equalsIgnoreCase("Y"));

            //Break statement omitted to output Goodbye Statement & Exit Program
           
            case 2: //Exit Program (Planned)
                System.out.println("Thank you for using the factorial program!"
                        + " Goodbye!\n");
                System.exit(0);
                break;

            default: //Exit Program (Unplanned, error)
                System.out.println("Input error.");
                System.exit(1);
                break;
        }
        
    } //End Main Method

} //End Class FactorialProgram

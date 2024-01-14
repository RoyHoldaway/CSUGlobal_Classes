import java.util.Scanner;

public class Crit4 {
    public static void main(String[] args) {
        //Pseudocode:
        //Initialize variables
        //Import scanner for user input
        //Create while loop to collect 5 inputs of user data
        //Calculate data for the established variables
        //Output collected data

            // Establishing Variables
        double total = 0;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;
        int count = 0;
        // importing scanner for user input
        Scanner scanner = new Scanner(System.in);
        //the while loop will cycle 5 times so we can get the 5 user input values
        while (count < 5) {
            //Note this line is put before the if statement is called as to have it print before the user inputs their data
            System.out.print("Enter any value: ");
            //once there have been 5 variables added to the system it will not print or call anymore from the while loop
            if (scanner.hasNextDouble()) {
                double userInput = scanner.nextDouble();

                // Update total variable by adding new user data to existing total variable
                total += userInput;

                // Update maximum and minimum variables by comparing input to established maximum and minimum variable
                if (userInput > maximum) {
                    maximum = userInput;
                }
                if (userInput < minimum) {
                    minimum = userInput;
                }
                    //This adds to the count variable until it reaches 5, then closes the while loop
                count++;
            } else { //This else statement is to stop any incorrectly input values such as letters or symbols
                System.out.println("Invalid input. Please enter a valid value.");
                scanner.next(); // This is to clear out the input buffer to allow the scanner fucntion to be called upon again
            }
        }
            //Turn off the scanner as we no longer need more user input
        scanner.close();
        //finding the average of the inputs
        Double Average = total / 5;

        //Then we use the data from our variables to input into legible sentances for our data
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + Average);
        System.out.println("The Maximum input is: " + maximum);
        System.out.println("The Minimum input is: " + minimum);
        // establishing the interest variable and calculating the correct answer
        double interest = total * 0.20;

        System.out.println("And with interest rate of 20% the total interest would be: " + interest);
        
        
    }
}

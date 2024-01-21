import java.util.Scanner;
import java.util.ArrayList;

//Psuedo code for this program
// Import scanner and arraylist for user input and array list manipulation
// Initialize variables to be used for array lists that will be filled with user input
// establish loop for inputting temperature of the 7 days
// utilize user input for day or week process, if the user inputs day show the average for that day,
// if they say week, add all the days temperatures together and create an average.
// print out all requested user submitted data

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initializing variables
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> averageTemp = new ArrayList<>();

        // Array list of the days (Monday - Sunday)
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Have user to enter temperatures for each day
        for (String day : dayNames) {
            System.out.print("Enter the average temperature for " + day + ": ");

            // Read the entire line of input
            String inputLine = scanner.nextLine();

            try {
                // Process the temperature
                double temperature = Double.parseDouble(inputLine);
                daysOfWeek.add(day);
                averageTemp.add(temperature);
            } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid temperature for " + day + ".");
            }
        }


    System.out.print("Enter 'day' to display daily data, 'week' to display weekly data: ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("day")) {
            // Display daily data
            for (int i = 0; i < 7; i++) {
                System.out.println("Day: " + daysOfWeek.get(i) + ", Temperature: " + averageTemp.get(i));
            }
        } else if (userInput.equalsIgnoreCase("week")) {
            // Display weekly data and calculate weekly average
            double weeklySum = 0;
            for (int i = 0; i < 7; i++) {
                System.out.println("Day: " + daysOfWeek.get(i) + ", Temperature: " + averageTemp.get(i));
                weeklySum += averageTemp.get(i);
            }
            double weeklyAverage = weeklySum / 7;
            System.out.println("Weekly Average Temperature: " + weeklyAverage);
        } else {
            System.out.println("Invalid input. Please enter 'day' or 'week'.");
        }

        scanner.close();
    }

}
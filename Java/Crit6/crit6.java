import java.util.Scanner;

// Psuedo code:
// Establish variables
// Create remove vehicle function
// have user input car information
// save the car information
// call the remove car function

public class crit6 {
    public static void main(String[] args) {
    // Create an instance of the Vehicles class
        Vehicles myCar = new Vehicles();
    
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input car information
        System.out.print("What manufacturer is your car?: ");
        String makeInput = scanner.nextLine();
        System.out.print("What model is your car?: ");
        String modelInput = scanner.nextLine();
        System.out.print("What color is your car?: ");
        String colorInput = scanner.nextLine();
        System.out.print("What year is your car?: ");
        int yearInput = scanner.nextInt();
    
        // Save the car information
        myCar.savedCarMake = makeInput;
        myCar.savedCarModel = modelInput;
        myCar.savedCarColor = colorInput;
        myCar.savedCarYear = yearInput;
    
        // Display users input car details
        System.out.println("You have added a " + myCar.savedCarYear + " " + myCar.savedCarMake + " " + myCar.savedCarModel + " in " + myCar.savedCarColor);

        // Call the removeVehicle method
        myCar.removeVehicle(makeInput, modelInput, colorInput, yearInput);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
    
    public static class Vehicles {
        private String savedCarMake;
        private String savedCarModel;
        private String savedCarColor;
        private int savedCarYear;
    
        public void removeVehicle(String carMake, String carModel, String carColor, int carYear) {
            if (carMake.equals(savedCarMake) && carModel.equals(savedCarModel) && carColor.equals(savedCarColor) && carYear == savedCarYear) {
                // Override variables from previous input
                savedCarMake = null;
                savedCarModel = null;
                savedCarColor = null;
                savedCarYear = 0;
                // Inform user the vehicle has been removed
                System.out.println("Vehicle has been removed from the database");
            } else {
                System.out.println("Vehicle information is not in the database");
            }
        }
    }
}

    
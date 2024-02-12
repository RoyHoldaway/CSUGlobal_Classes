import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private double mileage;

    // Default constructor
    public Automobile() {
        make = "";
        model = "";
        color = "";
        year = 0;
        mileage = 0.0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, Double mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Add a new vehicle method
    public String addVehicle(String make, String model, String color, int year, Double mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Failed to add vehicle: ";
        }
    }

    // List vehicle information method
    public String[] listVehicleInformation() {
        try {
            return new String[]{make, model, color, String.valueOf(year), String.valueOf(mileage)};
        } catch (Exception e) {
            return new String[]{"Failed to list vehicle information: "};
        }
    }

    // Remove a vehicle method
    public String removeVehicle() {
        try {
            make = null;
            model = null;
            color = null;
            year = 0;
            mileage = 0.0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Failed to remove vehicle";
        }
    }

    // Update vehicle attributes method
    public String updateVehicleAttributes(String make, String model, String color, int year, Double mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle attributes updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle attributes:";
        }
    }
}

public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Get user input for car details
            System.out.println("Enter car make:");
            String make = scanner.nextLine();

            System.out.println("Enter car model:");
            String model = scanner.nextLine();

            System.out.println("Enter car color:");
            String color = scanner.nextLine();

            System.out.println("Enter car year:");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter car mileage:");
            double mileage = Double.parseDouble(scanner.nextLine());

            // Create an instance of the Automobile class with user input
            Automobile car = new Automobile(make, model, color, year, mileage);

            // List vehicle information
            String[] vehicleInfo = car.listVehicleInformation();
            for (String info : vehicleInfo) {
                System.out.println(info);
            }

            // Remove the vehicle
            System.out.println(car.removeVehicle());

            // Get new car details from user input
            System.out.println("Enter new car make:");
            make = scanner.nextLine();

            System.out.println("Enter new car model:");
            model = scanner.nextLine();

            System.out.println("Enter new car color:");
            color = scanner.nextLine();

            System.out.println("Enter new car year:");
            year = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter new car mileage:");
            mileage = Double.parseDouble(scanner.nextLine());

            // Add a new vehicle with user input
            System.out.println(car.addVehicle(make, model, color, year, mileage));

            // List the new vehicle information
            vehicleInfo = car.listVehicleInformation();
            for (String info : vehicleInfo) {
                System.out.println(info);
            }

            // Update the vehicle with new details
            System.out.println("Enter updated car make:");
            make = scanner.nextLine();

            System.out.println("Enter updated car model:");
            model = scanner.nextLine();

            System.out.println("Enter updated car color:");
            color = scanner.nextLine();

            System.out.println("Enter updated car year:");
            year = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter updated car mileage:");
            mileage = Double.parseDouble(scanner.nextLine());

            System.out.println(car.updateVehicleAttributes(make, model, color, year, mileage));

            // List the updated vehicle information
            vehicleInfo = car.listVehicleInformation();
            for (String info : vehicleInfo) {
                System.out.println(info);
            }

            // Ask user if they want to print information to a file
            System.out.println("Do you want to print the information to a file? (Y/N)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                // Print information to a predefined file location
                printToFile(vehicleInfo);
                System.out.println("Information printed successfully.");
            } else if (response.equalsIgnoreCase("N")) {
                System.out.println("Information will not be printed.");
            } else {
                System.out.println("Invalid input.");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error printing to file");
        }
    }

    // Print information to file
    private static void printToFile(String[] vehicleInfo) {
        try {
            String filePath = "/Users/royholdaway/Desktop/school/csu global/computer science classes/Java/Critical Thinking 8/Autos.txt";
            
            FileWriter writer = new FileWriter(filePath);
            for (String info : vehicleInfo) {
                writer.write(info + "\n");
            }
            writer.close();

            System.out.println("Vehicle information printed");
        } catch (IOException e) {
            System.out.println("Error printing to file");
        }
    }
}
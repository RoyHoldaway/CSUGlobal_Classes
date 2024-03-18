import java.util.Scanner;

public class Crit5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers:");
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        double product = multiplyArray(numbers, 0);
        System.out.println("Product of the numbers: " + product);
    }

    public static double multiplyArray(double[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }
        return array[index] * multiplyArray(array, index + 1);
    }
}

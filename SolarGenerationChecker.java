import java.util.Scanner;

public class SolarGenerationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading energy generated from the user
        System.out.print("Enter the energy generated (in kWh): ");
        double energyGenerated = scanner.nextDouble();

        // Checking the condition using if-else
        if (energyGenerated >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        scanner.close();
    }
}
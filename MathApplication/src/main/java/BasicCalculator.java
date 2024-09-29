import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.println("Enter the first number:");
        float firstNumber = scanner.nextFloat();

        // Prompt user to enter the second number
        System.out.println("Enter the second number:");
        float secondNumber = scanner.nextFloat();

        // Display the possible operations
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        // Ask the user to choose an option
        System.out.println("Please select an option:");
        char option = scanner.next().charAt(0);

        // Perform the corresponding calculation based on user's choice

        if  (option == 'A' || option == 'a'){
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

        } else if (option == 'S')
        switch (option) {
            case 'A':
            case 'a':
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case 'S':
            case 's':
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case 'M':
            case 'm':
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case 'D':
            case 'd':
                if (secondNumber != 0) {
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }

        // Close the s
        scanner.close();
    }
}

import java.util.Scanner;

public class File_052_Randon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second value: ");
        double number2 = scanner.nextDouble();

        double random = Math.random() * 100;

        double average = (number1 + number2 + random) / 3;

        double maximum = Math.max(Math.max(number1, number2), random);
        double minimum = Math.min(Math.min(number1, number2), random);

        System.out.println("First Value: " + number1);
        System.out.println("Second Value: " + number2);
        System.out.println("Random Value: " + random);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        scanner.close();
    }
}
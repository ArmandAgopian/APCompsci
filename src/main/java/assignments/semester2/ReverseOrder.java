package assignments.semester2;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        System.out.println("The size of the array: " + numbers.length);
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Enter number " + (index + 1) + ": ");
            Scanner scan = new Scanner(System.in);
            numbers[index] = scan.nextDouble();
        }

        System.out.println("The numbers in reverse order: ");
        for (int index = numbers.length - 1; index >= 0; index--)
            System.out.println(numbers[index] + "  ");
        System.out.println();
    }
}

// Chapter1_Challenge_1_1.java
// The Cryptic Message Decoder
// Demonstrates use of variables and operators (no loops or if-statements)

import java.util.Scanner;

public class Chapter1_Challenge_1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cryptic number: ");
        int num = input.nextInt();

        int digits = (int) Math.log10(num) + 1;

        // Extract first digit
        int firstDigit = num / (int) Math.pow(10, digits - 1);

        // Extract last digit
        int lastDigit = num % 10;

        // Extract second and second-last digits
        int secondDigit = (num / (int) Math.pow(10, digits - 2)) % 10;
        int secondLastDigit = (num / 10) % 10;

        // Compute product and sum
        int product = firstDigit * lastDigit;
        int sum = secondDigit + secondLastDigit;

        // Concatenate results
        String finalCode = "" + product + sum;

        System.out.println("The decrypted code is: " + finalCode);
    }
}
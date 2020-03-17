/* Calculation of weight on the moon */

import java.util.Scanner;


class ex3 {
    public static void main(String args[]) {
        final double gravityForseRatio = 0.17;
        System.out.print("Enter your weight at the Earth and press enter: ");
        Scanner scan = new Scanner(System.in);
        double weight = 0.0;
        try {
            weight = scan.nextDouble();
            if (weight < 0.0) throw new NumberFormatException();
        } catch (Exception e) {
            System.out.println("Incorrect value (the weight must be a positive real number).");
        }
        System.out.println("At the Moon your weight would be " +
                String.format("%.2f",weight*gravityForseRatio) +
                " (i.e. " + String.format("%.2f",gravityForseRatio) + " times smaller).");

    }
}

import java.util.*;
public class controlflow {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // 1. Program to check if a number is divisible by 5.
//        int number = scanner.nextInt();
//        boolean isDivisible = (number % 5 == 0);
//        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);


        // 2. Program to check if the first is the smallest of the 3 numbers.
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        boolean isFirstSmallest = (num1 < num2 && num1 < num3);
//        System.out.println("Is the first number the smallest? " + isFirstSmallest);


        // 3. Program to check if the first, second, or third number is the largest.
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        if(num1>num2 && num1>num3)
//        System.out.println("num 1 is largest ";
//        else if(num2 > num1 && num2 > num3);
//        System.out.println("num 2 is largest ");
//        else
//        System.out.println("num 3 is largest);


        // 4. Program to check for a natural number and write the sum of n natural numbers.
//            int number = scanner.nextInt();
//            if (number > 0) {
//                long sum = (long) number * (number + 1) / 2;
//                System.out.println("The sum of " + number + " natural numbers is " + sum);
//            } else {
//                System.out.println("The number " + number + " is not a natural number");
//            }


        // 5. Program to check whether a person can vote.
//            int age = scanner.nextInt();
//            if (age >= 18) {
//                System.out.println("The person's age is " + age + " and can vote.");
//            } else {
//                System.out.println("The person's age is " + age + " and cannot vote.");
//            }


        // 6. Program to check whether a number is positive, negative, or zero.
//            int number = scanner.nextInt();
//            if (number > 0) {
//                System.out.println("The number is positive.");
//            } else if (number < 0) {
//                System.out.println("The number is negative.");
//            } else {
//                System.out.println("The number is zero.");
//            }
//

        // 7. Program to check for Spring Season (March 20 to June 20).
//            int month = scanner.nextInt();
//            int day = scanner.nextInt();
//            boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
//                    (month == 4 && day >= 1 && day <= 30) ||
//                    (month == 5 && day >= 1 && day <= 31) ||
//                    (month == 6 && day >= 1 && day <= 20);
//            if (isSpring) {
//                System.out.println("It's a Spring Season");
//            } else {
//                System.out.println("Not a Spring Season");
//            }


        // 8. Program to count down using a while loop.
//            int counter = scanner.nextInt();
//            while (counter >= 1) {
//                System.out.println(counter);
//                counter--;
//            }
//            System.out.println("Blast off!");

        // 9. Program to count down using a for-loop.
//            int number = scanner.nextInt();
//            System.out.println("Rocket Launch Countdown:");
//            for (int i = number; i >= 1; i--) {
//                System.out.println(i);
//            }
//            System.out.println("Blast off!");

        // 10. Program to find the sum of numbers until the user enters 0.
//            double total = 0.0;
//            double number;
//            do {
//                number = scanner.nextDouble();
//                total += number;
//            } while (number != 0);
//            System.out.println(total);


        // 11. Program to find the sum until the user enters 0 or a negative number.
//            double total = 0.0;
//            while (true) {
//                double number = scanner.nextDouble();
//                if (number <= 0) {
//                    break;
//                }
//                total += number;
//            }
//            System.out.println( total);


        // 12. Program to find the sum of n natural numbers using while loop and compare with formula.
//            int num = scanner.nextInt();
//            if (num <= 0) {
//                System.out.println("Not a natural number.");
//            }
//            long sumFormula = (long) num * (num + 1) / 2;
//            long sumLoop = 0;
//            int i = 1;
//            while (i <= num) {
//                sumLoop += i;
//                i++;
//            }
//            System.out.println("Sum from formula: " + sumFormula);
//            System.out.println("Sum from while-loop: " + sumLoop);
//            if (sumFormula == sumLoop) {
//                System.out.println("The results from both computations are correct.");
//            } else {
//                System.out.println("There is a mismatch in the computations.");
//            }

        // 13. Program to find the sum of n natural numbers using for loop and compare with formula.
//            int number = scanner.nextInt();
//            if (number <= 0) {
//                System.out.println("Not a natural number.");
//                return;
//            }
//            long sumFormula = (long) number * (number + 1) / 2;
//            long sumLoop = 0;
//            for (int i = 1; i <= number; i++) {
//                sumLoop += i;
//            }
//            System.out.println("Sum from formula: " + sumFormula);
//            System.out.println("Sum from for-loop: " + sumLoop);
//            if (sumFormula == sumLoop) {
//                System.out.println("The results from both computations are correct.");
//            } else {
//                System.out.println("There is a mismatch in the computations.");
//            }

        // 14. Program to find the factorial of an integer using a while loop.
//            int number = scanner.nextInt();
//            if (number < 0) {
//                System.out.println("Factorial is not defined for negative numbers.");
//                return;
//            }
//            long factorial = 1;
//            int i = number;
//            while (i > 1) {
//                factorial *= i;
//                i--;
//            }
//            System.out.println("The factorial of " + number + " is " + factorial);

        // 15. Program to find the factorial of an integer using a for loop.
//            int number = scanner.nextInt();
//            if (number < 0) {
//                System.out.println("Factorial is not defined for negative numbers.");
//                return;
//            }
//            long factorial = 1;
//            for (int i = 1; i <= number; i++) {
//                factorial *= i;
//            }
//            System.out.println("The factorial of " + number + " is " + factorial);

        // 16. Program to print odd and even numbers between 1 to N.
//            int num = scanner.nextInt();
//            for (int i = 1; i <= num; i++) {
//                if (i % 2 == 0) {
//                    System.out.println(i + " is an even number");
//                } else {
//                    System.out.println(i + " is an odd number");
//                }
//            }


        // 17. Program to find the bonus of employees based on years of service.

//            double salary = scanner.nextDouble();
//            int yearsOfService = scanner.nextInt();
//            if (yearsOfService > 5) {
//                double bonus = salary * 0.05;
//                System.out.println("Congratulations! You get a bonus of: " + bonus);
//            } else {
//                System.out.println("No bonus for employees with 5 or fewer years of service.");
//            }

    }

}

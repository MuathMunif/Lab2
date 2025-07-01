import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*1 - Write a Java method to find the smallest number among three
             numbers. */
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the first number: ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Input the second number: ");
//        int secondNumber = scanner.nextInt();
//        System.out.println("Input the third number: ");
//        int thirdNumber = scanner.nextInt();
//        System.out.println("The smallest value is : "+ smallest(firstNumber, secondNumber, thirdNumber));
        /*-------------------------------------------------------------*/



        /*q2 - Write a Java method that check if the entered number is negative or
               positive or zero. */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int number = scanner.nextInt();
//        System.out.println(checkNumber(number));
        /*---------------------------------------------------------------*/



        /*q3 - Write a Java method to check whether a string is a valid password.
               Password rules:
               A password must have at least ten characters. A
                 password consists of only letters and digits. A
                 password must contain at least two digits. */


        Scanner scanner = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("1. A password must have at least eight characters. ");
            System.out.println("2. A password consists of only letters and digits. ");
            System.out.println("3. A password must contain at least two digits ");
            System.out.println("Input a password (You are agreeing to the above Terms and Conditions.):");
            password = scanner.nextLine();
            if (passwordValidation(password)) {
                System.out.println("Invalid password. Please try again.");
            }
        }while (passwordValidation(password));
        System.out.println("Password is valid : " + password);


    }
    // out of the main

    public static int smallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }


    public static String checkNumber(int a) {
        String number = "";
        if (a < 0){
            return number = "the number is negative";
        }
        else {
            return number = "the number is positive";
        }
    }


    public static boolean passwordValidation(String password) {
        if (password.length() < 8) {
            System.out.println("Password length must be at least 8 characters");
            return true;
        }
        else if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$")) {
            System.out.println("Password contains invalid characters");
            return true;
        }
       int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digits++;
            }
        }
        if (digits < 2) {
            System.out.println("Password length must be at least 2 digits");
            return true;
        }
        return false;
    }
}
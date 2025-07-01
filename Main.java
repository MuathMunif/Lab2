import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*1.Write a program to find all of the longest word in a given dictionary. */
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("cat");
//        list.add("dog");
//        list.add("red");
//        list.add("is");
//        list.add("am");
//
//        ArrayList<String> longestWord = new ArrayList<>();
//        int maxLength = 0;
//
//        for (String word : list) {
//            if (word.length() > maxLength) {
//                longestWord.clear();
//                longestWord.add(word);
//                maxLength = word.length();
//            } else if (word.length() == maxLength) {
//                longestWord.add(word);
//            }
//        }
//        System.out.println(longestWord);
        /*--------------------------------------------------------------*/



        /*q2. Write a program that displays the number of occurrences of an element in the array. */

//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(3);
//        list.add(3);
//        list.add(5);
//
//        int one = 0;
//        int two = 0;
//        int three = 0;
//        int four = 0;
//        int five = 0;
//        int six = 0;
//        int seven = 0;
//        int eight = 0;
//        int nine = 0;
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == 1) {
//                one++;
//            }
//            if (list.get(i) == 2) {
//                two++;
//            }
//            if (list.get(i) == 3) {
//                three++;
//            }
//            if (list.get(i) == 4) {
//                four++;
//            }
//            if (list.get(i) == 5) {
//                five++;
//            }
//            if (list.get(i) == 6) {
//                six++;
//            }
//            if (list.get(i) == 7) {
//                seven++;
//            }
//            if (list.get(i) == 8) {
//                eight++;
//            }
//            if (list.get(i) == 9) {
//                nine++;
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter (-1) to exit");
//        System.out.println("Enter the number of elements you want to search: ");
//        while (true) {
//
//            int n = scanner.nextInt();
//            if (n == -1) {
//                break;
//            }
//            if (list.contains(n) && n == 1) {
//                System.out.println(n + " occurs " + one + " times");
//            }
//             else if (list.contains(n) && n == 2) {
//                System.out.println(n + " occurs " + two + " times");
//            }
//            else if (list.contains(n) && n == 3) {
//                System.out.println(n + " occurs " + three + " times");
//            }
//            else if (list.contains(n) && n == 4) {
//                System.out.println(n + " occurs " + four + " times");
//            }
//            else if (list.contains(n) && n == 5) {
//                System.out.println(n + " occurs " + five + " times");
//            }
//            else if (list.contains(n) && n == 6) {
//                System.out.println(n + " occurs " + six + " times");
//            }
//            else if (list.contains(n) && n == 7) {
//                System.out.println(n + " occurs " + seven + " times");
//            }
//            else if(list.contains(n) && n == 8) {
//                System.out.println(n + " occurs " + eight + " times");
//            }
//            else if (list.contains(n) && n == 9) {
//                System.out.println(n + " occurs " + nine + " times");
//            }
//            else {
//                System.out.println(n + " occurs " + 0 + " times");
//            }
//        }

        /*----------------------------------------------------------------------*/



        /*3.Write a program to find the k largest elements in a given array. Elements in the array can be in
            any order. */

//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(17);
//        list.add(7);
//        list.add(25);
//        list.add(3);
//        list.add(100);
//        int first = list.get(0);
//        int second = list.get(1);
//        int third = list.get(2);
//
//        if (first < second) {
//            int temp = first;
//            first = second;
//            second = temp;
//        } else if (first > second) {
//            first = second;
//        } else if (first < third) {
//            first = second;
//        }
//        for (int i = 3; i < list.size(); i++) {
//           int num = list.get(i);
//           if (num > first) {
//               third = second;
//               second = first;
//               first = num;
//           }
//           else if (num > second) {
//               third = second;
//               second = num;
//           }
//           else if (num > third) {
//               third = num;
//           }
//        }
//        System.out.println(" 3 largest elements of the said array are: "+ first + " and " + second + " and " + third);
        /*------------------------------------------------------------------------*/



        /*q4. Create a method to reverse an array of integers. Implement the method without creating a new
              array. */

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        reverseArray(list);
//        for(Integer i : list){
//            System.out.println(i);
//        }
        /*--------------------------------------------------------------------*/



        /*5. Write a menu-driven Java program with following option: */
//
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        do {
//            System.out.println("1. Accept elements of an array ");
//            System.out.println("2. Display elements of an array ");
//            System.out.println("3. Search the element within array");
//            System.out.println("4. Sort the array ");
//            System.out.println("5. Exit");
//            int choice = scanner.nextInt();
//            if (choice == 5) {
//                break;
//            }
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter an array element: ");
//                    list.add(scanner.nextInt());
//                    break;
//                case 2:
//                    System.out.println("Display elements of an array: " + list);
//                    break;
//                case 3:
//                    System.out.println("Search the element within array: ");
//                    int index = scanner.nextInt();
//                    if (list.contains(index)) {
//                        System.out.println("Element found at index " + index);
//                    } else {
//                        System.out.println("Element not found");
//                    }
//                    break;
//                case 4:
//                    System.out.println("Sort the array ");
//                    for (int i = 0; i < list.size() - 1; i++) {
//                        for (int j = i + 1; j < list.size(); j++) {
//                            if (list.get(i) > list.get(j)) {
//                                int temp = list.get(i);
//                                list.set(i, list.get(j));
//                                list.set(j, temp);
//                            }
//                        }
//                    }
//                    break;
//                case 5:
//                    System.out.println("Exit");
//                    break;
//            }
//        } while (true);
        /*-----------------------------------------------------------------*/



        /*q6. Create a method that generates a random number within a given range. Allow the user to
              specify the range and call the method to display random numbers. */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the minimum value of the range :");
//        int number = scanner.nextInt();
//        System.out.println("Enter the maximum value of the range :");
//        int number2 = scanner.nextInt();
//        System.out.println(randomNumber(number, number2));
//        System.out.println(randomNumber(number, number2));
//        System.out.println(randomNumber(number, number2));
//        System.out.println(randomNumber(number, number2));
//        System.out.println(randomNumber(number, number2));
        /*----------------------------------------------------------------------------------*/


        /*q7. Write a program that checks the strength of a password. Create a method that evaluates a
              password based on criteria like length, inclusion of special characters, and
              uppercase/lowercase letters. */

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter The password : ");
//        String password = scanner.nextLine();
//        int sum = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
//        if (sum >= 8 ) {
//            System.out.println("Password is Strong .");
//        }
//        else if (sum >= 5 ) {
//            System.out.println("Password is Moderately strong .");
//        }
//        else {
//            System.out.println("Password is Weak .");
//        }
        /*---------------------------------------------------------------------*/


        /*q8. Create a method that generates the Fibonacci sequence up to a specified number of terms. */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of Fibonacci terms to generate: ");
//        int n = scanner.nextInt();
//        System.out.println("Fibonacci sequence with "+n+" terms: ");
//        generateFibonacci(n);
        /*--------------------------------------------------------------------*/


    }// out of the main

    public static void reverseArray(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;

        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }
    }

    public static Integer randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }


    public static Integer checkLength(String password) {
        int points = 0;
        if (password.length() <= 5) {
            points = 0;
        } else if (password.length() >= 6 && password.length() <= 7) {
            points = 2;
        } else if (password.length() >= 8) {
            points = 3;
        }
        return points;
    }

    public static Integer checkSpecialCharacters(String password) {
        int points = 0;
        if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$")) {
            points = 2;
        }
        return points;
    }

    public static Integer checkUpperCaseLowerCase(String password) {
        int points = 0;
        if (password.matches("^(?=.*[a-z])(?=.*[A-Z]).*$")) {
            points = 3;
        }
        return points;
    }

    public static void generateFibonacci(int n) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}


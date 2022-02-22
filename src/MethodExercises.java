import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        //adds the two nums
        System.out.println(addition(4,9));
        //subtracts the two nums
        System.out.println(subtraction(9,4));
        //multiplies the two nums
        System.out.println(multiplication(9,4));
        //divides the two nums
        System.out.println(division(9,3));
        //gets the remainder of the two nums
        System.out.println(modulus(15,3));
        getInteger(1, 10);
//        System.out.println(factorialUsingRecursion(8));

    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }
//put the factorial method into the get integer method so it only requires one call
    public static int getInteger(int num1, int num2) {
        //Declaration
        Scanner sc = new Scanner(System.in);
        //Prompt
        System.out.println("Enter a number between " + num1 + " and " + num2 + ".");
        int userInput = sc.nextInt();
        if (userInput >= num1 & userInput <= num2) {
            System.out.println(factorial(userInput));
        } else {
            getInteger(num1,num2);
        }
        return factorial(userInput);
    }

    public static int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }



}

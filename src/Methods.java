import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        sayHi();
//        System.out.println(sayHello("Christian"));
//        System.out.println(addNums(4, 5));
//        userName();
        System.out.println(newSum());
    }

    public static void sayHi() {
        System.out.println("hi");
    }

    public static String sayHello(String name) {
        return "hello " + name;
    }

    public static int addNums(int num1, int num2) {
        int solution = num1 + num2;
        return solution;
    }
    //write a method that accepts user's name from input and returns "hello, user input"

    public static void userName() {
        Scanner user = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userInput = user.nextLine();

        System.out.println(sayHello(userInput));

    }

    public static int newSum() {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter a two numbers(seperated by return key): ");
        int num1 = numbers.nextInt();
        int num2 = numbers.nextInt();
        System.out.print("Your new sum is: ");

        return num1 + num2;

    }

    //



    //sayHi - the name of our method
    //public -> can be accessed globally by other packages and classes
    //static -> not declaring specific primitive type
    //void/string/int/... -> return type
}

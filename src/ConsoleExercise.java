import java.util.Scanner;

public class ConsoleExercise {
    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately " + "%.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNum = scanner.nextInt();

        System.out.println("You entered: --> \"" + userNum + "\" <--");
        //when something that isn't an integer is entered the user will get an error in Scanner nextInt()
        //Declarations
        Scanner scanner1 = new Scanner(System.in);
        String string1;
        String string2;
        String string3;

        //Prompt
        System.out.print("Enter 3 words: ");

        //Entered values
        string1 = scanner1.next();
        string2 = scanner1.next();
        string3 = scanner1.next();

        System.out.println("This is what you entered: ");
        System.out.println(string1 + ", " + string2 + ", and " + string3);

    }
}

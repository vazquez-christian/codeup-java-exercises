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

        //Console Output
        System.out.println("This is what you entered: ");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        //when entering more than 3 words the system will still run but only output the first 3 words, but when less the 3 is entered the system will not respond but wont return an error

        //Declarations
        Scanner scanner2 = new Scanner(System.in);
        String sentence;

        //Prompt
        System.out.print("Enter a sentence: ");

        //Entered Values
        sentence = scanner2.nextLine();

        //Console Output
        System.out.println("Here is your sentence: ");
        System.out.println(sentence);

        //When using scanner.next() only receiving the first letter of the sentence. When using scanner.nextLine() I was able to return the whole sentence

        //Declarations
        Scanner areaCalculator = new Scanner(System.in);
        String length;
        String width;

        //Prompt 1
        System.out.print("Enter the length of your room: ");

        //Entered value
        length = areaCalculator.nextLine();

        //Prompt 2
        System.out.print("Now enter the width: ");

        //Entered value
        width = areaCalculator.nextLine();







    }
}

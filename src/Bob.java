import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        //Declarations
        Scanner bob = new Scanner(System.in);
        String bobSure = "Sure.";
        String bobScared = "Whoa, chill out!";
        String bobMad = "Fine. Be that way!";
        String bobWhatever = "Whatever";

        //Prompt
        System.out.println("Talk to Bob, the lackadaisical teenager!");

        //User Value
        String userInput = bob.nextLine();

        //If/else statement to get Bob to respond
        if (userInput.endsWith("?")) {
            System.out.println(bobSure);
        } else if (userInput.endsWith("!")) {
            System.out.println(bobScared);
        } else if (userInput.length() == 0) {
            System.out.println(bobMad);
        } else {
            System.out.println(bobWhatever);
        }

    }
}

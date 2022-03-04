package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    public boolean yesNo() {
        System.out.println("yes or no");
        String userInput = this.scanner.next();
        return userInput.contains("y");
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.next();
        return userInput.contains("y");
    }
    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.println("Enter a from " + min + " and " + max + ".");
            userInput = this.scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }

}

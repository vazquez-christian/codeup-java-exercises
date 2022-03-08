package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MovieApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input userInput = new Input();
        Movie[] movieArray = MoviesArray.findAll();

        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("6 - add a movie");
            System.out.println("Enter your choice: ");

            int userChoice = userInput.getInt();
            System.out.println("choice =" + userChoice);

            if (userChoice == 1) {
                for (Movie movie : movieArray) {
                    System.out.println(movie.getTitle() + "--" + movie.getCategory());
                    System.out.println();
                }
            } else if (userChoice == 2) {
                for (Movie movie : movieArray) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getTitle() + "--" + movie.getCategory());
                        System.out.println();
                    }
                }
            } else if (userChoice == 3) {
                for (Movie movie : movieArray) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getTitle() + " -- " + movie.getCategory());
                        System.out.println();
                    }
                }
            } else if (userChoice == 4) {
                for (Movie movie : movieArray) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getTitle() + " -- " + movie.getCategory());
                        System.out.println();
                    }
                }
            } else if (userChoice == 5) {
                for (Movie movie : movieArray) {
                    if (movie.getCategory().equals("sci-fi")) {
                        System.out.println(movie.getTitle() + " -- " + movie.getCategory());
                        System.out.println();
                    }
                }
            } else if (userChoice == 6) {
                Movie[] newArray = Arrays.copyOf(movieArray, movieArray.length + 1);
                System.out.println("Enter a title: ");
                String title = scanner.nextLine();
                System.out.println("Enter a category: ");
                String category = scanner.nextLine();
                Movie newMovie = new Movie(title, category);
                System.out.println(newMovie);
                newArray[newArray.length - 1] = newMovie;

                for (Movie value : newArray) {
                    System.out.println(value.getTitle() + "--" + value.getCategory());
                }
            } else if (userChoice == 0) {
                System.exit(0);
            }
        } while(true);
    }
}
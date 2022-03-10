package fileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

public class LectureNotes {
    public static void printPoem(Path filepath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filepath); //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        //Paths class = static methods to obtain filepaths (Path class)
        //Path interface = Abstracts away differences between windows and MacOS [vs. trying to do everything with Strings]
        //Files class - Files.methods() for manipulating / interacting with files ^ utilizing above paths
        //File class object{} representation of a file

        String myString = "This string";

        //Declaring a path using "Path" as the datatype
        Path pathToPoem = Paths.get("src/fileIO/wcw.txt");

        System.out.println("pathToPoem = " + pathToPoem);

        //Now we're seeing if it actually finds an existing file
        System.out.println("Files.exists(pathToPoem) = " + Files.exists(pathToPoem));

        printPoem(pathToPoem);

        //Now CREATING a file and its directory/path to it...
        //First: A string representation of where I want the directory to go
        String directory = "./src/fileIO/data";
        //Second: A string representing the file
        String fileName = "groceryList.txt";

        Path dataDirectory = Paths.get(directory); // Path-ify that String with the directory
        Path dataDirectoryAndFile = Paths.get(directory, fileName); // Combining both Strings into one "Path"!

        System.out.println();

//        System.out.println("dataDirectory = " + dataDirectory);
//        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        if (Files.notExists(dataDirectoryAndFile)) {
            //This creates the directory if it doesn't already exist
            Files.createDirectories(dataDirectory);
            //creates file in said directory if it doesn't already exist
            Files.createFile(dataDirectoryAndFile);
        }
        //File IO Part 3 - Created files and directories that did not exist, now how do we manipulate what's INSIDE the files?
        System.out.println("dataDirectoryAndFile = " + dataDirectoryAndFile);

        //First let's set up something we want to WRITE into our text file - how about some groceries we need?
        List<String> groceryList = Arrays.asList("coffee", "cat food", "roast beef", "carrots", "potatoes", "onions", "bread");

        System.out.println("groceryList = " + groceryList);
        //WRITING the information to the groceryList
        Files.write(dataDirectoryAndFile, groceryList);

        //Now one that's just an UPDATE
        List<String> forgotAGrocery = Arrays.asList("muenster cheese", "gouda cheese", "colby jack cheese");
        //APPENDING the information to the list AKA an update...
        Files.write(dataDirectoryAndFile, forgotAGrocery, StandardOpenOption.APPEND);

        //Now that we've updated the list how do I print that information

        List<String> printGroceryList = Files.readAllLines(dataDirectoryAndFile);

        System.out.println();
        System.out.println("printGroceryList = " + printGroceryList);
        for (int i = 0; i < printGroceryList.size(); i++) {
            System.out.println((i + 1) + " : " + printGroceryList.get(i));
        }

        //A more complicated example - replacing a found element with a new element!
        //First: Let's get the grocery list from the text file as it exists now

        List<String> printGroceryList2 = Files.readAllLines(dataDirectoryAndFile);
        //Second: Let's set up a second array list to hold the updated list we want to write to the text file
        List<String> newList = new ArrayList<>();

        //In english : Look inside of one line in all of these lines I got from my text file

        for(String line : printGroceryList2) {

            if(line.equalsIgnoreCase("gouda cheese")) {
                newList.add("vegan cheese");
                continue;
            }

            newList.add(line);
        }

        System.out.println("printGroceryList2 = " + printGroceryList2);
        System.out.println("newList = " + newList);
        printGroceryList2 = newList;
        System.out.println("printGroceryList2 (overwrite experiment)= " + printGroceryList2);

        Files.write(dataDirectoryAndFile, newList);

    }
}

import java.util.Arrays;

public class ArraysNotes {
    public static void main(String[] args) {
        //length of arrays must be defined before using in Java
        //data type that is going to be stored in the array

        //SYNTAX
        String[] texasWeather = new String[3];
        //int[] - data type of the variable
        //[3] - the length of the array being created
        //new int[3] - initializing new array of integers
        texasWeather[0] = "sunny";
        texasWeather[1]= "rainy";
        texasWeather[2]= "cloudy";
        System.out.println(Arrays.toString(texasWeather));

        //TODO: Create an array of ints and print them out

        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(numbers));

        // // // PSEUDOCODE
        //create a method (nums)
        //method signature and data type
        //create an array of ints
        //what's the length of the array
        //where does the array go
        //assign values to the array
        //how are we going to initialize the array
        // // array literal {}?
        // // array declaration new int[]
        //iterate through our elements in the array
        //traditional for loop
        //enhanced for loop
        //create a variable to store the sum
        //logic that will add each element to itself

        for (int number : numbers) {
            System.out.println(number);
        }





    }


}

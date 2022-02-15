// class - defining the class
//HelloWorld is the name of the class, and it matches the name of the .java file
public class HelloWorld {

    //method - similar to a function in JS
    //main method -> specific method in java that acts as our entry point when running java
    //similar to starting point in a board game
    public static void main(String[] args) {
        //public - pinned for later
        //static - pinned for later
        //void - for now, it means this method doesn't expect anything to be returned
        //main - name of our method, main is keyword that is going to be searched as the entry point
        //String[] args - passing in a string array named args

        //print out "hello world" to the console
        System.out.println("Hello World");
        System.out.println("Hello World");

        int myFavoriteNumber = 36;
        String myString = "Hello Codeup";

        System.out.println(myString);

//        float myNumber = 3.14;

//        System.out.println(myNumber);
        //outputs the x value before its incremented and then prints the incremented number
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        // increments first and then prints the new number for both prints
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //doesn't work because class is a keyword
//        int class = 4;

        //creates a runtime error
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;


        //strings cannot be converted to ints
//        int three = (int) "three";

        //top issue is a runtime error because no syntax was wrong but the logic doesn't make sense
        //the bottom issue states a string cannot be converted into an int

//        int x = 4;
//        System.out.println(x =+ 5);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        //this will first divide x and y and then y - x
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);

        //the number is incremented over what it can hold will cycle through until what its allowed to hold.

    }


}

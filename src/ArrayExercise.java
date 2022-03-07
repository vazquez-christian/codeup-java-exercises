import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Christian"), new Person("Jason"), new Person("Justin")};

        for (int i = 0; i < people.length; i++) {
            System.out.println("people[" + i + "] = " + people[i].getName());
        }

        Person[] people1 = Arrays.copyOf(people, people.length + 1);
        System.out.println("people1 = " + Arrays.toString(people1));
        people1[3] = new Person("Jared");
        System.out.println("people1 = " + Arrays.toString(people1));

        for (int i = 0; i < people1.length; i++) {
            System.out.println("people[" + i + "] = " + people[i].getName());
        }
    }
}

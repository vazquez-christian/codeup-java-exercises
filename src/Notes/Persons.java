package Notes;

public class Persons {
    //Two String data types
    public String firstName;
    public String lastName;
    //Extra examples: More fields for a Person to have when instantiated (created)
    private int age;
    public String relationshipStatus;

    //Properties can also be METHODS, e.g.
    public String sayHello() {
        return String.format("Hello from %s %s", firstName, lastName);
    }

    public static void main(String[] args) {
        //CREATED AN INSTANCE OF A PERSON
        Persons kenneth = new Persons();
        kenneth.firstName = "Kenneth";
        kenneth.lastName = "Howell";
        kenneth.age = 34;
        kenneth.relationshipStatus = "taken";
        System.out.println(kenneth.firstName);
        System.out.println("sayHello() = " + kenneth.sayHello());
    }

}

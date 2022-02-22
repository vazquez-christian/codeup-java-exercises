public class Person {
    private String firstName;

    public String getName() {
        return this.firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public void sayHello() {
        System.out.println("Hello from " + this.firstName + "!");
    }

    public Person (String name) {
        this.firstName = name;
    }

    public static void main(String[] args) {
        Person newUser = new Person("Christian");
//        newUser.sayHello();
        newUser.setName("Carlos");
        newUser.sayHello();
        System.out.println(newUser.getName());

//        Person person1 = new Person("John"); //Creates a new person named John
//        Person person2 = new Person("John"); //Creates another new person also named John
//        System.out.println(person1.getName().equals(person2.getName())); // Going to return just one John... // returned true
//        System.out.println(person1 == person2); //Going to return person1 and person2 or true... // returned false

//        Person person1 = new Person("John");
//        Person person2 = person1; //assigning the person1 as person2 as well wil not change it, its just two variables for the same thing.. its redundant
//        System.out.println(person1 == person2); // Going to return true because the statement will always be true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); //Will print John
        System.out.println(person2.getName()); //Will also print John
        person2.setName("Jane"); //Will change person2 name to "Jane".. // also changes person1 name
        System.out.println(person1.getName()); //Will print John.. // actually printed Jane
        System.out.println(person2.getName()); //Will print Jane
    }
}


public class Main {

    /**
     * Greet a person.
     * 
     * @param pee that is Person class or Student class(extends Person)
     */
    public static void greet(Person pee) {
        /*
         * \n = newline character 
         * %n = system-depend end of line character
         */
        System.out.println("\n" + pee.toString());

        System.out.printf("Hello, %s!%n", pee.getName());
        System.out.println("Have a nice day.");
    }

    /**
     * Start the application
     * 
     * @param args command line argumens
     */
    public static void main(String[] args) {

        // Person person = new Person("Joe Hacker", 123);
        // Student student = new Student("Apisit", 456);

        // // if greet() is not static method use
        // // Main main = new Main();
        // // main.greet(person);

        // greet(person);
        // greet(student);

        Person[] people = new Person[3];
        people[0] = new Person("Joe Hacker", 123);
        people[1] = new Student("Apisit", 456);
        // really?
        if (System.currentTimeMillis() % 2 == 1)
            people[2] = new Person("EvenSteven", 789);
        else
            people[2] = new Student("Odd ball", 1011);

        // greet all people
        for (Person p : people)
            greet(p);
    }
}
public class Person extends Entity {
    /** Constructor for  */
    public Person() {
        System.out.println("Creating a new Person");
    }

    protected String name;
    public Person(String name) {
        System.out.println("Creating a new Person, Name is "+ name);
        this.name = name;
    }
}
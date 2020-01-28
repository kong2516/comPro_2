public class Student extends Person {

    public Student(String name, int id) {
        super(name, id);
    }

    public String toString() {
        return "";
    }
    
    public void greet(Person pee) {
        /*
         * \n = newline character
         * %n = system-depend end of line character
         */
        System.out.println(pee.toString());

        System.out.printf("Hello, %s!%n", pee.getName());
        System.out.println("Have a nice day.");
    }

    public static void main(String[] args) {
        
        Person person = new Person("Joe Hacker", 123);
        Student student = new Student("Apisit", 456);

        // Main main = new Main();
        student.greet(person);
        
    }
}
public class Student extends Person {
    /** Constructor for  */
    // public Student() {
    //     System.out.println("Creating a new Student");
    // }
    
    // NOT 'name'
    protected  long id;
    public Student(String name, long id) {
        super(name);  // very first
        // this.name = name;  // access from Person
        this.id = id;
    }

    public String toString() {
        return this.name + " " + this.id + super.getAge();
    }

    public static void main(String[] args) {
        Student s = new Student("sese",123);
        System.out.println(s);
    }
}
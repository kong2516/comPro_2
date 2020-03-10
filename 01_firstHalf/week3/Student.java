/**
 * Sub class of Person do as a Person clas, but String are different so we know
 * how it different from Person
 */
public class Student extends Person {

    public Student(String name, int id) {
        super(name, id);
    }

    /** Override Person class */
    @Override // no need to have this line
    public String toString() {
        return "A student named " + getName() + ", id: " + super.id;
    }

    public void knowMe() {
        System.out.println(equals(new Student("name", 122)));
    }

    public static void main(String[] args) {
        Student s = new Student("name", 122);
        String name = s.getName();
        System.out.println(name);
        
        s.knowMe();
    }
}
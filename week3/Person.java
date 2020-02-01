public class Person {

    protected String name;
    protected long id;

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    // public void setName(String name) {
    //     this.name = (this.name != null) ? name : this.name;
    // }

    public boolean equals(Object obj) {
        // 1. must not be null
        if (obj == null)
            return false;
        // 2. check typr of the arg
        if (obj.getClass() != this.getClass())
            return false;
        else {
            // for this class
            Person objc = (Person) obj;
            return (objc.name.equals(this.name) && objc.id == this.id);
        }
    }

    public String toString() {
        return "A person named " + this.name + ", id: " + this.id;
    }

    // public static void main(String[] args) {
    //     Student obj = new Student("Sese", 123456789);
    //     Student me = new Student("Sese", 123456789);
    //     // System.out.println(me.equals(obj)); // true
    //     System.out.println(me);
    // }
}
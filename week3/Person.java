import java.util.Date;
import java.time.LocalDate;

public class Person {

    protected String name;
    protected long id;
    protected LocalDate birthday;

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthday() {
        int year = this.birthday.getYear();
        int month = this.birthday.getMonthValue();
        int day = this.birthday.getDayOfMonth();
        Date birthday = new Date(year, month, day);
        return birthday;
    }

    public void setBirthday(int year, int month, int day) {
        this.birthday = LocalDate.of(year, month, day);
    }
    public int getAge() {
        return 1;
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
            Person objc = (Person) obj;
            return (objc.name.equals(this.name) && objc.id == this.id);
        }
    }

    public String toString() {
        return "name: " + this.name + ", id: " + this.id;
    }

    // public static void main(String[] args) {
    //     Student obj = new Student("Sese", 123456789);
    //     Student me = new Student("Sese", 123456789);
    //     // System.out.println(me.equals(obj)); // true
    //     System.out.println(me);
    // }
}
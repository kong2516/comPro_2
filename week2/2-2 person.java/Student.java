import java.util.Date;
import java.time.LocalDate;

public class Student {

    private String name;
    private long id;
    private LocalDate birthday;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = (this.name != null) ? name : this.name;
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

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() == this.getClass()) {
            Student objc = (Student) obj;
            return (objc.name == this.name && objc.id == this.id);
        } else {
            return false;
        }
    }

    public String toString() {
        return this.name + " id: " + this.id + "\nBirthday: " + this.birthday;
    }

    public static void main(String[] args) {
        Student obj = new Student("Sese", 123456789);
        Student me = new Student("Sese", 123456789);
        // System.out.println(me.equals(obj));  // true
        me.setBirthday(2001,7,3);
        System.out.println(me);
    }
}
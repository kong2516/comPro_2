public class Cat extends Animal {

    private static long nextid = 0;

    public Cat(String name) {
        super(name, "Cat" + nextid);
        nextid++;
    }

    @Override
    public void can() {
        System.out.println("Can Sleep");
    }

    public String toString() {
        return String.format("Name: %s [%s]", super.getName(), super.getId());
    }
}
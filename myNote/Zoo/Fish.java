public class Fish extends Animal {

    private static long nextid = 0;

    public Fish(String name) {
        super(name, "Fish" + nextid);
        nextid++;
    }

    @Override
    public void can() {
        System.out.println("Can Swim");
    }

    public String toString() {
        return String.format("Name: %s [%s]", super.getName(), super.getId());
    }
}
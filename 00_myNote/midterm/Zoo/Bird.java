public class Bird extends Animal {

    private static long nextid = 0;

    public Bird(String name) {
        super(name, "Bird" + nextid);
        nextid++;
    }

    @Override
    public void can() {
        System.out.println("Can Fly");
    }

    public String toString() {
        return String.format("Name: %s [%s]", super.getName(), super.getId());
    }
}
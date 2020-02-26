public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void can() {
        System.out.println("Cannot Fly");
    }

    public String toString() {
        return String.format("Name: %s [%s]", super.getName(), super.getId());
    }
}
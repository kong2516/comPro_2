public class Fiction extends Book {

    public Fiction(long id, String name) {
        super(id, name);
    }

    /**
     * Class: ___, Name: ___, ID: ___
     */
    public String toString() {
        return String.format("Class: Fiction, Name: %s, ID: %d", super.getName(), super.getId());
    }

    // TODO try me!

    public static void main(String[] args) {
    Fiction ss = new Fiction(2345675L, "sssss");
    System.out.println(ss);
    }
}
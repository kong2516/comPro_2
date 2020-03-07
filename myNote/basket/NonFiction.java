// TODO use inheritance(Book class) here!

public class NonFiction extends Book {

    public NonFiction(long id, String name) {
        super(id, name);
    }

    /**
     * Class: ___, Name: ___, ID: ___
     */
    public String toString() {
        return String.format("Class: NonFiction, Name: %s, ID: %d", this.getName(), this.getId());
    }
}
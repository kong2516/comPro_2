public class Book implements Property {

    private long id;
    private String name;

    /**
     * get the info of book
     * 
     * @param id
     * @param name
     * @throws IllegalArgumentException if ID is negative
     * @throws IllegalArgumentException if name is null or empty
     */
    public Book(long id, String name) {
        if (id <= 0)
            throw new IllegalArgumentException("ID can't be negative");
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("name can't be null or empty");
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    /** Override equals */
    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (this.getClass() != other.getClass())
            return false;
        Book book = (Book) other;
        return (book.getId() == this.getId() && (book.getName().equals(this.getName())));
    }

    /**
     * Class: ___, Name: ___, ID: ___
     */
    public String toString() {
        return String.format("Class: Book, Name: %s, ID: %d", this.getName(), this.getId());
    }

    // TODO try me!

    public static void main(String[] args) {
        Book b = new Book(1120305779L, "Paprika");
        System.out.println(b);
        Book ss = new Fiction(23333399L, "Lord of the Ring");
        System.out.println(ss);
        Book aa = new NonFiction(2417421L, "Minna no Nihongou");
        System.out.println(aa);
        Book hh = new NonFiction(54321L, "");
        System.out.println(hh);
    }
}

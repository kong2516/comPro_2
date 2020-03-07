public class CD implements Property {

    private String name;
    private long id;
    private static long nextId = 100_000;

    /**
     * get the info of CD with custom id
     * 
     * @param name
     * @throws IllegalArgumentException if name is null or empty
     */
    public CD(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name can't be null or empty");
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    /** Override equals */
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        CD cd = (CD) other;
        return (cd.getId()==this.getId() && (cd.getName().equals(this.getName())));
    }

    /**
     * Class: ___, Name: ___, ID: ___
     */
    public String toString() {
        return String.format("Class: CD, Name: %s, ID: %d", this.getName(), this.getId());
    }

    // TODO try me!

    // public static void main(String[] args) {
    // CD cd = new CD("DogGod");
    // System.out.println(cd);
    // CD d = new CD("ABC");
    // System.out.println(d);
    // }

}
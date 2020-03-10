public class Animal {

    private String name;
    private String id = "-Unkonw Animal-";
    

    public Animal(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void can() {
        
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return String.format("Name: %s [%s]", this.name, this.id);
    }
}
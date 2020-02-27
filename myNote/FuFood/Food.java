/**
 * Food
 */
public class Food {

    private String name;
    private double price;
    private String place;

    public Food(String name, double price, String place) {
        this.name = name;
        this.price = price;
        this.place = place;
    }

    public String toString() {
        return String.format("%s is %,.2f-baht that place in %s", this.name, this.price, this.place);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getPlace() {
        return this.place;
    }
}
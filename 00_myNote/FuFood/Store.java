import java.util.ArrayList;
import java.util.List;

/**
 * Store
 */
public class Store {

    private static List<Food> listFood = new ArrayList<Food>();

    public Store() {
    }

    public void setStore() {
        Food[] foods = { new Food("Sezay", 0.02, "NewBar"), new Food("Gift", 0.2, "NewBar"),
                new Food("Ploy", 2, "NewBar"), new Food("Inn", 20, "IUPBar") };

        for (Food f : foods)
            Store.listFood.add(f);
    }

    public List<Food> getListFood() {
        return Store.listFood;
    }

    public void buy(String namefood, String foodfrom) {
        for (Food data : Store.listFood) {
            if (data.getName().equals(namefood) && data.getPlace().equals(foodfrom)) {
                Store.listFood.remove(data);
                System.out.println("\nBuying -" + namefood + " from " + foodfrom + "- Successful\n");
                break;
            }
        }
    }

    public void display() {
        for (Food f : listFood)
            System.out.println(f);
    }
}
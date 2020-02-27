import java.util.ArrayList;
import java.util.List;

public class Bar {

    private String barName;
    private List<Food> foods = new ArrayList<Food>();
    private Store s = new Store();

    public Bar(String barName) {
        this.barName = barName;
        for (Food data : s.getListFood()) {
            if (data.getPlace().equals(this.barName))
                foods.add(data);
        }
    }

    // นี้มันโง่!
    public int findFoodQuantity(String foodName) {
        int n = 0;
        for (Food item : foods) {
            if (item.getName().equals(foodName))
                n++;
        }
        return n;
    }

    public void buyFood(String food) {
        s.buy(food, this.barName);
    }

    public String toString() {
        return "Fuc U";
    }
}
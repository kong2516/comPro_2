import java.util.*;

public class Basket {

    private List<Property> basket = new ArrayList<Property>();
    /** max capacity of basket */
    private final int capacity;

    public Basket(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Return size of this basket
     * 
     * @return size
     */
    public int basketSize() {
        return basket.size();
    }

    /**
     * Check if this basket is full or not.
     * 
     * @return true if the basket is full
     */
    public boolean isFull() {
        if (this.basketSize() < this.capacity)
            return false;
        return true;
    }

    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Get number of that type item in the basket
     * 
     * @param type of Property
     * @return number of that type item in the basket
     */
    public int getQuantutyOfType(String type) {
        int quantuty = 0;
        for (Property property : basket) {
            String className = property.getClass().toString().substring(6);
            // String className = property.getClass().getName();
            if (className.equalsIgnoreCase(type))
                quantuty++;
        }
        return quantuty;
    }

    /**
     * try to insert stuff to the basket, and Return true if success(basket not
     * full), false if it not
     * 
     * @param stuff
     * @return true/false
     */
    public boolean insert(Property stuff) {
        if (isFull())
            return false;
        basket.add(stuff);
        return true;
    }

    /**
     * Take out an item from the basket
     * 
     * @param id   of an item
     * @param name of an item
     * @return array of stuff that still in the basket
     */
    public Property[] takeOut(long id, String name) {
        List<Property> list = new ArrayList<Property>();
        // นี่มันโง่!
        // for (Property property : basket) {
        // System.out.println(property);
        // if (property.getId() == id && property.getName().equalsIgnoreCase(name)){
        // basket.remove(property);
        // list.add(property);
        // }
        // }
        for (int i = 0; i < this.basketSize(); i++) {
            Property item = basket.get(i);
            // System.out.println(item);
            if (item.getId() == id && item.getName().equalsIgnoreCase(name)) {
                list.add(item);
                basket.remove(item);
            }
        }
        Property[] array = new Property[1];
        list.toArray(array);
        return array;
    }

    /** Sort and Return all items in the basket */
    public String toString() {
        Collections.sort(basket, new PropertyComparator());
        String s = "Basket:\n";
        for (Property property : basket) {
            s += property + "\n";
        }
        return s;
    }
}
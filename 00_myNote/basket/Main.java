/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(5);
        Property[] items = { new Book(12345l, "asdf"), new Fiction(23323443536L, "Apple"),
                new NonFiction(12445L, "sunflower"), new CD("Pokemon"), new CD("Digimon") };

        for (Property p : items) {
            basket.insert(p);
        }
        System.out.println(basket.getQuantutyOfType("CD"));
        // 2
        System.out.println(basket);
        // Basket:
        // Class: CD, Name: Pokemon, ID: 100000
        // Class: CD, Name: Digimon, ID: 100001
        // Class: NonFiction, Name: sunflower, ID: 12445
        // Class: Fiction, Name: Apple, ID: 23323443536
        // Class: Book, Name: asdf, ID: 12345

        Property[] n = basket.takeOut(100001L, "Digimon");
        // Property[] n = basket.takeOut(23323443536L, "Apple");
        System.out.println("Take out:");
        for (Property p : n) {
            System.out.println(p);
        }
        // Class: Fiction, Name: Apple, ID: 23323443536
        System.out.println(basket);
    }
}
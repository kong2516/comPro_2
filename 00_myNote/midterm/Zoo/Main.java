import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void display(Animal anime) {
        System.out.print(anime+ "  ");
        anime.can();
    }
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList();
        Animal[] myanimals = {
            // new Animal("sese"),
            new Cat("nyeko"),
            new Bird("jibjib"),
            new Fish("nemo"),
            new Fish("npmo"),
            new Fish("nlmo"),
            new Penguin("lolor"),
        };

        // add animal to zoo
        for (Animal myanimal: myanimals) {
            zoo.add(myanimal);
        }

        System.out.println("_____________________________");
        // display all animal in zoo
        for (Animal animal: zoo) {
            display(animal);
        }

        // sort animal in list zoo by AnimalComparator
        Collections.sort(zoo, new AnimalComparator());

        System.out.println("_____________________________");
        // display all animal in zoo
        for (Animal a: zoo) {
            display(a);
        }
    }
}
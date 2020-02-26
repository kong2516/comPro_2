import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        char first1 = animal1.getId().charAt(0);
        char first2 = animal2.getId().charAt(0);
        if (first1 < first2)
            return -1;
        if (first1 > first1)
            return 1;
        return 0;
    }
}
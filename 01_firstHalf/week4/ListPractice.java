import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        System.out.println();
        List<Coin> list = new ArrayList<Coin>();
        Coin tw = new Coin(20, "Astra");
        list.add(tw);

        // System.out.println("Size = " + list.size());
        // System.out.println("list.get(0) = " + list.get(0));

        // make list
        for (int val = 9; val > 0; val--)
            list.add(new Coin(val, "Baht"));

        // // print list's size
        // System.out.println("List size is " + list.size());

        // // print list
        // System.out.println();
        // for (Coin c : list)
        //     System.out.println(c);

        // // find sum
        // double sum = 0;
        // for (Coin c : list)
        //     sum += c.getValue();
        // System.out.println(String.format("\nSum = %.2f", sum));

        // sort list
        Collections.sort(list);
        System.out.println();
        for (Coin c : list)
            System.out.println(c);

        // remove Coin(20, "Astra") use index
        list.remove(9);
        System.out.println();
        for (Coin c : list)
            System.out.println(c);

        // // remove all
        // list.removeAll(list);

        // check Empty
        System.out.println("\nSize = " + list.size());
        System.out.println("isEmpty = " + list.isEmpty());

        // List<Integer> tempIndex = new ArrayList<Integer>();
        // System.out.println(tempIndex.isEmpty());

        // Coin[] array = new Coin[tempIndex.size()];
        // System.out.println(tempIndex.toArray(array));
    }
}
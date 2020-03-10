import java.util.*;

/**
 * StringUtil
 */
public class StringUtil {

    /**
     * A method to remove short words using a for-each loop.
     * 
     * @param list is a list of strings to process. Short strings are removed.
     */
    static void removeShortStrings(List<String> list) {
        // for (String word : list) {
        // if (word.length() < 3) {
        // System.out.println("Removing " + word);
        // list.remove(word);
        // }
        // }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < 3) {
                System.out.println("Removing " + list.get(i));
                list.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        // In a class, you need to import java.util.Arrays.
        // In jshell its already imported.
        List<String> words = Arrays.asList("apple", "be", "cat", "it", "to", "bird", "dog");

        // removeShortStrings(words);
        // System.out.println("List contains " + words);

        List<String> wordlist = new ArrayList<>();
        wordlist.addAll(words); // copy from the 'words' list into ArrayList
        // now process the list
        removeShortStrings(wordlist);
        System.out.println("List contains " + wordlist);

    }
}
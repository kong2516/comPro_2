import java.util.Comparator;

/** Comparator type and id of Property */

/**
 * PropertyComparator
 */
public class PropertyComparator implements Comparator<Property> {

    @Override
    public int compare(Property p1, Property p2) {
        String p1ClassName = p1.getClass().toString();
        String p2ClassName = p2.getClass().toString();
        if (p1ClassName == p2ClassName) {
            if (p1.getId() > p2.getId())
                return 1;
            else if (p1.getId() < p2.getId())
                return -1;
            else
                return 0;
        }
        return p1ClassName.compareToIgnoreCase(p2ClassName);
    }

}
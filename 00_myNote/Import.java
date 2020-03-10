import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

import java.util.Date;
import java.time.LocalDate;

public class Import {

    public static void main(String[] args) {

        List<Integer> lis = new ArrayList<Integer>();
        lis.add(3);
        lis.add(2);
        lis.add(1);
        // Collection no use
        Collections.sort(lis);
        System.out.println(lis);

        lis.add(5);
        lis.add(4);
        lis.add(6);
        // to Array
        Object[] array = new Object[lis.size()];
        Object[] li = lis.toArray(array);
        Arrays.sort(li);
        System.out.println(li);
        for (Object obj : li) {
            System.out.println(obj);

        }

        // LocalDate day = LocalDate.of(year, month, day);
        LocalDate myday = LocalDate.of(2001, 7, 3);
        // LocalDate yourday = myday.create(1999, 3, 8);
        System.out.println("\n(LocalDate)\nBirthday: " + myday);

        int year = myday.getYear();
        int month = myday.getMonthValue();
        int day = myday.getDayOfMonth();
        Date birthday = new Date(year, month, day);
        System.out.println("\n(Date)\nBirthday: " + birthday);
    }
}
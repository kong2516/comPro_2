package recursive;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("Ans = " + factorial(4));

    }

    public static int factorial(int upper) {
        if (upper == 1)
            return 1;
        else
            return upper * factorial(upper - 1);
    }
}
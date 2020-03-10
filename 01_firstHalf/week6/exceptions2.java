import java.io.*;
import java.math.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

import java.lang.IndexOutOfBoundsException;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.util.IllegalFormatConversionException;

public class exceptions2 {

    double[] score;
    // score.length
    // java.lang.NullPointerException
    Double[] scores = { 1.0, 2.0, 3.0 };
    // scores[3]
    // java.lang.ArrayIndexOutOfBoundsException:
    List<Double> list = Arrays.asList(scores);
    // list.get(list.size());
    // java.lang.ArrayIndexOutOfBoundsException:

    public static void main(String[] args) {
        // Double.parseDouble("008");

        // Object name = "sese";
        // char me = (char) name;

        // Long pwd = null;
        // pwd.toString();

        // char[] grade = {'A','B','C','D'};
        // char compro = grade[4];


    }
}
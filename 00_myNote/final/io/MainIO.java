package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * read
 */
public class MainIO {

    private final static String INPUT_FILE = "io/text.txt";
    private final static String OUTPUT_FILE = "io/output.txt";

    public static void main(String[] args) {
        String s = readfile(INPUT_FILE);
        // writefile(OUTPUT_FILE, s);
        System.out.println(s);

        // compare(INPUT_FILE, "io/text2.txt");
    }

    /**
     * Read file
     * 
     * @param filename
     * @return
     */
    public static String readfile(String filename) {
        String getReadfile = "";
        try (InputStream in = new FileInputStream(filename);) {
            int get;
            while (in.available() > 0) {
            // while (true) {
                get = in.read();
                // if (get < 0)
                //     break;
                getReadfile += (char) get;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return getReadfile;
    }

    /**
     * Write String to file
     * 
     * @param filename
     * @param textTowrite
     */
    public static void writefile(String filename, String textTowrite) {
        try (OutputStream out = new FileOutputStream(filename);) {
            out.write(textTowrite.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Compare file1, file2
     * 
     * @param file1
     * @param file2
     */
    public static void compare(String file1, String file2) {
        try (InputStream fileStream1 = new FileInputStream(file1);
                InputStream fileStream2 = new FileInputStream(file2);) {
            int byt = 0;
            while (true) {
                byt++;
                int get1 = fileStream1.read();
                int get2 = fileStream2.read();
                if (get1 < 0 && get2 < 0)
                    break;
                if (get1 < 0 || get2 < 0) {
                    System.out.println("shorterfile after byte  " + byt);
                    System.exit(0);
                }
                if (get1 != get2) {
                    System.out.println("diff at byte " + byt);
                    System.exit(0);
                }
            }
            System.out.println("Two files are the same");
        } catch (FileNotFoundException e) {
            System.out.println("file is not found");
        } catch (IOException e) {

        }
    }
}
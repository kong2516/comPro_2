public class block {

    int[] x = { 1, 2, 3, 4, 5 };
    String name; // null
    String y = "banana";

    static int num;
    static String mystr;
    // First Static block
    static {
        System.out.println("Static Block 1");
        num = 68;
        mystr = "Block1";
    }
    // Second static block
    static {
        System.out.println("Static Block 2");
        num = 98;
        mystr = "Block2";
    }

    public static void main(String args[]) {
        System.out.println("Value of num: " + num);
        System.out.println("Value of mystr: " + mystr);
    }
    // name = (y.length() < 0) ? y : "coder";
    // System.out.println(name);

    // for (int i : x) {
    // System.out.println(i);
    // }

    // for (int i=0 ; i<5; i++) {
    // System.out.println(x[i]);
    // }

}
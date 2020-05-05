public class copyArr {

    public static void main(String[] args) {
        String[] a = { "cat", "dog" };
        String[] b = { "ant", "bat", "fish" };

        b = a;

        b[0] = "dd";
        a[1] = "cc";

        System.out.println(b[0] + " ," + b[1]);
    }
}
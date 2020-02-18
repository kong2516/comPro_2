public class InputList {

    public InputList(String whatString, Object... x) {
        System.out.println(whatString);
        for (Object inx : x) {
            System.out.println(inx);
        }
    }

    public static void main(String[] args) {
        new InputList("\nSet of number?", 1, "2", 3.0);
    }
}
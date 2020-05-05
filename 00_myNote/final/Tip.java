/**
 * Tip
 */
public class Tip {

    public static void main(String[] args) {
        Tip tip = new Tip();

        // tip.byteToString();
        tip.useStringBuffer();
    }

    /**
     * create new String use byte[]
     */
    public void byteToString() {
        String string = "this is string";
        // get byte[]
        byte[] stringByte = string.getBytes();
        // create new String
        String newString = new String(stringByte);
        System.out.println(newString);
    }

    /**
     * create new String use StringBuffer()
     */
    public void useStringBuffer() {
        StringBuffer buffer = new StringBuffer();
        int c = 0;
        while (c<100) {
            c++;
            buffer.append((char) c);
        }
        System.out.println(buffer);
    }

}
/**
 * A really boring class.name
 */
public class Hello {
  /**
   * Run the appication.
   * 
   * @param arg - commant line parameter, first one is assumed to be person's name
   *            greet.
   */
  public static void main(String[] args) { // String[] = array of Strings
    // this is an end of line comment

    String x = "g'day"; // local variables
    // TODO
    // IF there is a command line arguments (strings), then use the
    // first argument as name of person to greet.
    // If no command line argument, then print "Hello, Coder"
    String name;
    if (args.length > 0) {
      name = args[0];
    } else {
      name = "Coder";
    }
    // conditional assignment
    // String name = (args.length > 0) ? args[0] : "coder";

    System.out.println("Hello World, " + name); /* I hope so */

    // Print all of the command line arguments (strings)
    // This is like Python:
    // for s in args:
    // print(s)name
    System.out.println("Argument are:");
    for (String s : args) {
      System.out.println(s);
    }
    // เขียนแบบนี้ก้ได้ for (String s : args) System.out.println(s);
    // ถ้ามีบรรทัดเดียว
  }

  public static void method2() {

    String name = "Kasetsart U."; // another local variable

  }
}
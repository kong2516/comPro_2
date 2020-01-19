/** A really boring class.name
 */
public class Hello {
    public static void main(String[] args) { // String[] = array of Strings
      // this is an end of line comment

      String x = "g'day";
      // TODO
      // IF there is a command line arguments (strings)
      // first argument as name of person to greet.
      // If no command line argument, then print "Hello, Coder"
      if (args.length > 0) {
        String name = args[0];
      }
      else {
        String name = "Coder";
      }
      // conditional assignment
      String name = (args.length)
      // there is no variable name (out of scope)
      System.out.println("Hello World," + name); /* I hope so */

      // Print all of the command line arguments (strings)
      // This is like Python:
      // for s in args:
      //    print(s)name
      System.out.println("Argument are:");
      for (String s : args) {
        System.out.println(s);
      }

      public static void name() {
        
      }
    }
  }
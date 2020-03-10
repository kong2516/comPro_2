import java.lang.annotation.ElementType;

public class Elab {

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative)
            return (a < 0 && b < 0);
        return ((a >= 0 || b >= 0) && (a < 0 || b < 0));
    }

    public String notString(String str) {
        if (str.length() >= 3 && "not".equals(str.substring(0, 3)))
            return (str);
        return ("not " + str);
    }

    public String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr = newStr + str.charAt(i) + str.charAt(i);
        }
        return newStr;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi"))
                count += 1;
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat"))
                countCat += 1;
            if (str.substring(i, i + 3).equals("dog"))
                countDog += 1;
        }
        return countCat == countDog;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e')
                count += 1;
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        String bigger = (lowerA.length() >= lowerB.length()) ? lowerA : lowerB;
        String smaller = (bigger == lowerA) ? lowerB : lowerA;
        return (bigger.substring(bigger.length() - smaller.length()).equals(smaller));
    }

    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0)
                    return true;
                String dot = String.valueOf(str.charAt(i - 1));
                if (!dot.equals("."))
                    return true;
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        if (str.contains("y")) {
            if (str.charAt(str.length() - 1) == 'y')
                return true;
            for (int i = str.length() - 1; i > 0; i--) {
                if (str.charAt(i) == 'y') {
                    String sub = str.substring(i + 1, str.length());
                    return !sub.contains("x");
                }
            }
        }
        if (!str.contains("x"))
            return true;
        return false;
    }

    public String mixString(String a, String b) {
        String newStr = "";
        String bigger = (a.length() >= b.length()) ? a : b;
        for (int i = 0; i < bigger.length(); i++) {
            if (i < a.length())
                newStr += a.charAt(i);
            if (i < b.length())
                newStr += b.charAt(i);
        }
        return newStr;
    }

    public String repeatEnd(String str, int n) {
        String newStr = "";
        String ending = str.substring(str.length() - n, str.length());
        for (int i = 0; i < n; i++)
            newStr += ending;
        return newStr;
    }

    public String repeatFront(String str, int n) {
        String newStr = "";
        for (int i = 0; i < n; i++)
            newStr += str.substring(0, n - i);
        return newStr;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String newStr = "";
        for (int i = 0; i < count; i++) {
            newStr += word;
            if (!(i == count - 1))
                newStr += sep;
        }
        return newStr;
    }

    public boolean prefixAgain(String str, int n) {
        if (str.length() == 1)
            return false;
        String prefix = str.substring(0, n);
        return str.substring(n, str.length()).contains(prefix);
    }

    // public boolean xyzMiddle(String str) {
    // int lenth = str.length();
    // if (lenth >= 3) {
    // // wTODO
    // }
    // return false;
    // }

    public String getSandwich(String str) {
        String sandwich = "";
        int countBreadF = 0;
        int countBreadB = 0;
        if (str.length() <= 10)
            return sandwich;
        while (!str.equals("")) {
            if (countBreadF != 1) {
                if (str.substring(0, 5).equals("bread")) {
                    countBreadF += 1;
                    str = str.substring(5, str.length());
                } else {
                    str = str.substring(1, str.length());
                }
            }
            if (countBreadB != 1) {
                if (str.substring(str.length() - 5, str.length()).equals("bread")) {
                    countBreadB += 1;
                    str = str.substring(0, str.length() - 5);
                } else {
                    str = str.substring(0, str.length() - 1);
                }
            }
            if (countBreadF == 1 && countBreadB == 1) {
                sandwich = str;
                break;
            }
        }
        return sandwich;
    }

    // public boolean sameStarChar(String str) {
    // boolean isSame = true;
    // char a = ' ';
    // char b = ' ';
    // char a1;
    // char b1;

    // if (str.contains("*")) {
    // String[] arrStr = str.split("\\*");
    // if (arrStr.length < 1)
    // return isSame;

    // for (String element : arrStr) {
    // System.out.println("element = "+element);

    // if (a == ' ' && !element.equals("")) {
    // a = element.charAt(0);
    // System.out.println("a = "+a);
    // b = element.charAt(element.length()-1);
    // System.out.println("b = "+b);

    // }

    // if (a != ' ') {
    // a1 = element.charAt(0);
    // System.out.println("a1 = "+a1);
    // b1 = element.charAt(element.length()-1);
    // System.out.println("b1 = "+b1);

    // System.out.println("got = "+(a1 != a && b1 != b));

    // if (a1 != b && b1 != b) {
    // isSame = false;
    // break;
    // }
    // }
    // }
    // }
    // return isSame;
    // }

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c)
            return 0;
        if (a == b)
            return c;
        if (a == c)
            return b;
        if (c == b)
            return a;
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        int[] arr = { a, b, c };
        int sum = 0;
        for (int num : arr) {
            if (num == 13)
                break;
            sum += num;
        }
        return sum;
    }

    public int noTeenSum(int a, int b, int c) {
        int[] arr = { a, b, c };
        int sum = 0;
        for (int num : arr) {
            if (num != 13 && num != 14 && num != 17 && num != 18 && num != 19)
                sum += num;
        }
        return sum;
    }

    public int roundSum(int a, int b, int c) {
        int[] arr = { a, b, c };
        int sum = 0;
        for (int num : arr) {
            if (num % 10 >= 5)
                sum += 10;
            sum += (num / 10) * 10;
        }
        return sum;
    }

    public boolean closeFar(int a, int b, int c) {
        if ((a + b + c) - (Math.min(a, Math.min(b, c)) * 3) == 3)
            return false;
        if (Math.abs(a - b) > 1 || Math.abs(a - c) > 1)
            return true;
        return false;
    }

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21)
            return 0;
        return (a - 21 > b - 21) ? a <= 21 ? a : b : b <= 21 ? b : a;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int small = Math.min(a, Math.min(c, b));
        int large = Math.max(a, Math.max(c, b));
        int medium = (small == a || large == a) ? (small == b || large == b) ? c : b : a;
        if (medium - small == large - medium)
            return true;
        return false;
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                count += 1;
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int biggest = 0;
        for (int num1 : nums) {
            for (int num2 : nums) {
                biggest = (biggest < num1 - num2) ? num1 - num2 : biggest;
            }
        }
        return biggest;
    }

    public int sum13(int[] nums) {
        int sum = 0;
        boolean after13 = false;
        for (int num : nums) {
            if (num == 13)
                after13 = true;
            else if (!after13) {
                sum += num;
            } else
                after13 = false;
        }
        return sum;
    }

    public int sum67(int[] nums) {
        boolean counting = true;
        int sum = 0;
        for (int num : nums) {
            if (num == 6)
                counting = false;
            if (counting)
                sum += num;
            if (num == 7)
                counting = true;
        }
        return sum;
    }

    public static void main(String[] args) {
        Elab e = new Elab();

        // Java: Warmup-1
        // boolean boo = e.posNeg(1, 1, false);
        // String boo = e.notString("not candy");

        // Java: String-2
        // String boo = e.doubleChar("Hi-There");
        // int boo = e.countHi("ABChi hi");
        // boolean boo = e.catDog("ctdog");
        // int boo = e.countCode("codexxcode");
        // boolean boo = e.endOther("Hiabc", "abc");
        // boolean boo = e.xyzThere("abcxyz");
        // boolean boo = e.bobThere("abcblok");
        // boolean boo = e.xyBalance("bxbbxy");
        // String boo = e.mixString("xxx", "yyyy");
        // String boo = e.repeatEnd("Hello", 3);
        // String boo = e.repeatFront("Chocolate", 4);
        // String boo = e.repeatSeparator("Word", "X", 3);
        // boolean boo = e.prefixAgain("aa", 1);
        // boolean boo = e.xyzMiddle("AAxyzBB"); // wTODO
        // String boo = e.getSandwich("breaxbreadybread");
        // boolean boo = e.sameStarChar("*xa*az"); // wTODO

        // Java: Logic-2
        // int boo = e.loneSum(3, 2, 3);
        // int boo = e.luckySum(1, 2, 13);
        // int boo = e.noTeenSum(2, 13, 1);
        // int boo = e.roundSum(10, 10, 19);
        // boolean boo = e.closeFar(1, 2, 3);
        // int boo = e.blackjack(34, 22);
        // boolean boo = e.evenlySpaced(4, 6, 2);

        // Java: Array-2
        // int[] a = {2, 1, 2, 3, 4};
        // int boo = e.countEvens(a);
        // int[] b = {7, 2, 10, 9};
        // int boo = e.bigDiff(b);
        // int[] c = { 1, 2, 2, 1, 13 };
        // int boo = e.sum13(c);
        int[] d = { 2, 7, 6, 2, 6, 7, 2, 7 };
        int boo = e.sum67(d);

        System.out.println(boo);
    }
}
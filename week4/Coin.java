import java.util.Arrays;

/**
 * A coin with a monetary value and currency.
 * 
 * @author Nanthakarn Limkool
 */
public class Coin implements Comparable<Coin> {

  private double value;
  private String currency;

  public Coin(double value, String currency) {
    this.value = value;
    this.currency = currency;
  }

  public double getValue() {
    return this.value;
  }

  public String getCurrency() {
    return this.currency;
  }

  public String toString() {
    if (this.value % 1 != 0)
      return String.format("%,.2f-%s coin", this.value, this.currency);
    return String.format("%,.f-%s coin", this.value, this.currency);
  }

  @Override
  public boolean equals(Object obj) {
    if (this.getClass() != obj.getClass())
      return false;
    Coin objc = (Coin) obj;
    return (this.value == objc.getValue() && this.currency.equals(objc.getCurrency()));
  }

  @Override
  public int compareTo(Coin anotherCoin) {
    if (0==this.currency.compareToIgnoreCase(anotherCoin.getCurrency())) {
      if (this.value > anotherCoin.getValue())
        return 1;
      if (this.value < anotherCoin.getValue())
        return -1;
      if (this.value == anotherCoin.getValue())
        return 0;
    }
    return -100;
  }

  // public static void main(String[] args) {
  // Coin c = new Coin(1, "Baht");
  // System.out.println(c);
  // Coin p = new Coin(1.3, "Baht");
  // System.out.println(p);

  // Coin[] coins = {
  // new Coin(5, "baht"),
  // new Coin(10, "Baht"),
  // new Coin(0.25, "baht"),
  // new Coin(.5, "Baht"),
  // new Coin(1, "gem"),
  // new Coin(10, "gem"), };

  // Arrays.sort(coins);
  // for (Coin c : coins)
  // System.out.println(c);
  // }
}

public class Main {

    public static void main(String[] args) {

        Store s = new Store();
        s.setStore();
        s.display();

        Bar bar;
        String tobar = "NB";
        // switch (tobar) {
        // case "NB":
        // bar = new NewBar();
        // case "IUP":
        // bar = new IUPBar();
        // default:
        // System.out.println("Fu k off somewhere");
        // bar = new Bar("Non");

        if (tobar.equals("NB")) {
            bar = new NewBar();
        } else if (tobar.equals("IUP")) {
            bar = new IUPBar();
        } else {
            System.out.println("Fucking Bar?");
            bar = new Bar("Non");
        }

        String whannaBuy = "Gift";
        bar.buyFood(whannaBuy);

        s.display();
    }
}
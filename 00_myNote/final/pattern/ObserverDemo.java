package pattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setCustomerName("A");
        customer2.setCustomerName("B");

        Product banana = new Product();
        banana.setProductName("Banana");
        banana.setAvailable(false);

        banana.registerObserver(customer1);
        banana.registerObserver(customer2);

        // customer don't want banana anymore
        banana.removeObserver(customer1);

        // banana is available
        banana.setAvailable(true);
    }
}

interface Observer {
    public void update(String productName);
}

interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}

class Customer implements Observer{

    private String customerName;
    private Subject subject;

    @Override
    public void update(String productName) {
        System.out.println("Hello " + customerName + ", " + productName + " is now available.");
    }

    public String getCustomerName() {
        return customerName;
    }
    public Subject getSubject() {
        return subject;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setSubject(Subject subject){
        this.subject = subject;
    }
}
class Product implements Subject {
    private String productName;
    private List<Observer> observerList = new ArrayList<Observer>();
    private boolean available;

    public Product() {
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if (available) {
            notifyObserver();
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Notify all customer");
        for (Observer observer : observerList) {
            observer.update(productName);
        }
    }
}

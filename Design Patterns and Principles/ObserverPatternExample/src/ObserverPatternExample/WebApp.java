package ObserverPatternExample;

public class WebApp implements Observer {
    public void update(float price) {
        System.out.println("WebApp received stock price update: " + price);
    }
}
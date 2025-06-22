package ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");
        image.display(); // loading + display
        image.display(); // only display (cached)
    }
}
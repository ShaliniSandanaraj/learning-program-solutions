package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .build();

        comp1.showSpecs();
    }
}
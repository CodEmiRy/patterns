package factory;

public class Sheep implements Vehicle {
    public Sheep() {
    }

    @Override
    public void start() {
        System.out.println("Rusza owca");
    }
}

package factory;

public class Car implements Vehicle {
    public Car() {
    }

    @Override
    public void start() {
        System.out.println("Rusza Car");

    }
}

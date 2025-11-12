package Latihan;

public class Car implements Vehicle.Action {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}

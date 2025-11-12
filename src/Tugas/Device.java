package Tugas;

public class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    // Nested Interface Connectivity
    public interface Connectivity {
        void connectToWiFi(String networkName);
        void disconnectFromWiFi();
    }
}

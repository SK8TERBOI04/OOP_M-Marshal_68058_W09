package Tugas;

public class SmartPhone extends Device implements Power, VolumeControl, Device.Connectivity {
    private int currentVolume;
    private String connectedNetwork;
    private boolean isOn;

    public SmartPhone(String brand, String model) {
        super(brand, model);
        this.currentVolume = 0;
        this.connectedNetwork = "Not connected";
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Smartphone is now ON.");
        } else {
            System.out.println("Smartphone is already ON.");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Smartphone is now OFF.");
        } else {
            System.out.println("Smartphone is already OFF.");
        }
    }

    @Override
    public void increaseVolume(int level) {
        if (!isOn) {
            System.out.println("Please turn on the device first!");
            return;
        }
        currentVolume += level;
        System.out.println("Volume increased to: " + currentVolume);
    }

    @Override
    public void decreaseVolume(int level) {
        if (!isOn) {
            System.out.println("Please turn on the device first!");
            return;
        }
        currentVolume -= level;
        if (currentVolume < 0) currentVolume = 0;
        System.out.println("Volume decreased to: " + currentVolume);
    }

    @Override
    public void connectToWiFi(String networkName) {
        if (!isOn) {
            System.out.println("Please turn on the device first!");
            return;
        }
        connectedNetwork = networkName;
        System.out.println("Connected to WiFi: " + connectedNetwork);
    }

    @Override
    public void disconnectFromWiFi() {
        if (!isOn) {
            System.out.println("Please turn on the device first!");
            return;
        }
        System.out.println("Disconnected from WiFi: " + connectedNetwork);
        connectedNetwork = "Not connected";
    }
}

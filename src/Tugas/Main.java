package Tugas;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Samsung", "Galaxy S24 Ultra");

        phone.displayInfo();
        phone.turnOn();
        phone.increaseVolume(10);
        phone.decreaseVolume(3);
        phone.connectToWiFi("UMN_WiFi");
        phone.disconnectFromWiFi();
        phone.turnOff();
    }
}

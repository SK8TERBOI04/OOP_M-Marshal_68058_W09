package Latihan;

public class C implements A, B {
    public void methodA() {
        System.out.println("Method A implemented");
    }

    public void methodB() {
        System.out.println("Method B implemented");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}

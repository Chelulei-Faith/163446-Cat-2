// Main class to demonstrate abstraction
public class Main{
    public static void main(String[] args) {
        // Creating objects using polymorphism
        Appliance fan = new Fan();
        Appliance tv = new TV();

        // Calling turnOn() method
        fan.turnOn();
        tv.turnOn();
    }
}
// Concrete subclass Fan
public class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan starts rotating");
    }
}
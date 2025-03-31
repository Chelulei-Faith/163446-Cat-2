// Concrete subclass TV
public class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV displays picture and plays sound");
    }
}
package homework_nr_8;

public class WashingMachine extends Appliance{
    double loadCapacity;

    @Override
    public void turnOn() {
        System.out.println("Washing machine is now washing clothes."+"\n");
    }

    public WashingMachine(String brand, int power, double loadCapacity) {
        super(brand, power);
        this.loadCapacity = loadCapacity;
    }


}

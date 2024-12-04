package homework_nr_8;

public abstract class Appliance {
    String brand;
    int power;

   public abstract void turnOn();

   public String displayInfo() {
        return (brand + " " + power + "W" );
   }

   public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
   }
}



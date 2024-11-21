package homework_nr_7.vehicle;

public class Motorcycle extends Vehicle{
   private int engineCapacity = 0;
   private boolean hasAbs = false;

    public int getEngineCapacity() {
        return engineCapacity;
    }

//    public void setEngineCapacity(int engineCapacity) {
//        this.engineCapacity = engineCapacity;
//    }

    public boolean isHasAbs() {
        return hasAbs;
    }

//    public void setHasAbs(boolean hasAbs) {
//        this.hasAbs = hasAbs;
//    }

    public Motorcycle(String brand, String model, int year, int engineCapacity, boolean hasAbs) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.hasAbs = hasAbs;
    }
    public void getInfoMoto () {
        System.out.print(engineCapacity + "cc, ABS:" + hasAbs);
    }
}

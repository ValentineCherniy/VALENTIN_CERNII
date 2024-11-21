package homework_nr_7.vehicle;

public class Car extends Vehicle{

    private int numberOfDoors = 4;
    private boolean isElectric = false;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

//    public void setNumberOfDoors(int numberOfDoors) {
//        this.numberOfDoors = numberOfDoors;
//    }

    public boolean getIsElectric() {
        return isElectric;
    }

//    public void setElectric(boolean electric) {
//        isElectric = electric;
//    }



    public Car(String brand, String model, int year, int numberOfDoors, boolean isElectric) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }


public void getInfoCar () {
    System.out.print("doors: " + numberOfDoors + " electric: " + isElectric);
}

}

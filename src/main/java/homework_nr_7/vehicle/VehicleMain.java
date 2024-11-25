package homework_nr_7.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car c_1 = new Car("Tesla", "Model S", 2023, 4, true);
        Motorcycle m_1 = new Motorcycle("Yamaha", "YZF-R3", 2021, 321, true);
        Motorcycle m_2 = new Motorcycle("Honda", "VT-750AC", 2004, 749, false);

        System.out.println("Output with getters...");
        System.out.println(c_1.getBrand() + " " + c_1.getModel() + " " + c_1.getYear() + ", doors: " + c_1.getNumberOfDoors() + ", electric: " + c_1.getIsElectric());
        System.out.println(m_1.getBrand() + " " + m_1.getModel() + " " + m_1.getYear() + ", " + m_1.getEngineCapacity() + "cc, ABS:" + m_1.isHasAbs());
        System.out.println(m_2.getBrand() + " " + m_2.getModel() + " " + m_2.getYear() + ", " + m_2.getEngineCapacity() + "cc, ABS:" + m_2.isHasAbs());

        System.out.println();
        System.out.println("Output with methods...");
        c_1.getInfoVehicle();
        c_1.getInfoCar();
        System.out.println();

        m_1.getInfoVehicle();
        m_1.getInfoMoto();
        System.out.println();

        m_2.getInfoVehicle();
        m_2.getInfoMoto();
    }
}

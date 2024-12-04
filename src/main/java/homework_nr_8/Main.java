package homework_nr_8;

public class Main {
    public static void main(String[] args) {
        Appliance app_1 = new WashingMachine("LG", 2000, 7.5);
        Appliance app_2 = new Microwave("Samsung", 1200, true);
        Appliance app_3 = new AirConditioner("Daikin", 1500, 12000, true);

        Appliance[] appliances = new Appliance[]{
                app_1, app_2, app_3
        };
        for (int i=0; i !=appliances.length; i++){
            System.out.println(appliances[i].displayInfo());
            if (appliances[i] instanceof WashingMachine) {
                System.out.println("This is a washing mashine with a load capacity " + ((WashingMachine) app_1).loadCapacity + " kg");
            }
            if (appliances[i] instanceof Microwave) {
                if (((Microwave) app_2).hasGrill){
                    System.out.println("This is a microwave with a grill");
                } else {
                    System.out.println("This is a microwave without a grill");
                };
            }
            if (appliances[i] instanceof AirConditioner) {
                if (((AirConditioner) app_3).hasInverter) {
                    System.out.println("“This is an air conditioner with cooling power of " + ((AirConditioner) app_3).coolingPower + "BTU and has inverter");
                } else {
                    System.out.println("“This is an air conditioner with cooling power of " + ((AirConditioner) app_3).coolingPower + "BTU and has not inverter");
                }
            }
            appliances[i].turnOn();
        }


    }
}

package homework_nr_8;

public class Main {
    public static void main(String[] args) {
        Appliance app_1 = new WashingMachine("LG", 2000, 7.5);
        Appliance app_2 = new Microwave("Samsung", 1200, true);
        Appliance app_3 = new AirConditioner("Daikine", 1500, 12000, true);
        //Appliance app_4 = new WashingMachine("testWM", 100000, 100000);
        //Appliance app_5 = new Microwave("testMW", 20000, false);

        Appliance[] appliances = new Appliance[]{
                app_1, app_2, app_3//, app_4, app_5
        };
        for (int i = 0; i != appliances.length; i++){
            System.out.println(appliances[i].displayInfo());
            if (appliances[i] instanceof WashingMachine tempWM) {
                System.out.println("This is a washing machine with a load capacity " + tempWM.loadCapacity + "kg");
            }
            if (appliances[i] instanceof Microwave tempMW) {
                if (tempMW.hasGrill){
                    System.out.println("This is a microwave with a grill");
                } else {
                    System.out.println("This is a microwave without a grill");
                }
            }
            if (appliances[i] instanceof AirConditioner tempAC) {
                if (tempAC.hasInverter) {
                    System.out.println("“This is an air conditioner with cooling power of " + tempAC.coolingPower + "BTU and has inverter");
                } else {
                    System.out.println("“This is an air conditioner with cooling power of " +  tempAC.coolingPower+ "BTU and has not inverter");
                }
            }
            appliances[i].turnOn();
        }
    }
}




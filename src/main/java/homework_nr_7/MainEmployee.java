package homework_nr_7;

public class MainEmployee {
    public static void main(String[] args) {

        Employee e1 = new Employee("Anton", 23, "Garage");
        Employee e2 = new Employee("Anna", 36, "Accounting");
        Employee e3 = new Employee("Gheorghe", 49, "Administration");

        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getDepartment());

        e2.setDepartment("Administration");
        System.out.println(e2.getName() + " moved to " + e2.getDepartment() + " department due of team re-organization");
    }
}

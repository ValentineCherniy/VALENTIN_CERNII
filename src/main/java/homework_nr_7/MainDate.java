package homework_nr_7;

public class MainDate {
    public static void main(String[] args) {
       Date d_1 = new Date(21, 1, 1996);
       Date d_2 = new Date (19, 9, 2023);

       System.out.println("Interesting facts:");
       System.out.println("Java 1.0 was presented " + d_1.getDay() + "/" + Date.monthName[d_1.getMonthIndex()-1] + "/" + d_1.getYear());
       System.out.println("Java 21 SE was released " + d_2.getDay() + "/" + Date.monthName[d_2.getMonthIndex()-1] + "/" + d_2.getYear());
    }
}

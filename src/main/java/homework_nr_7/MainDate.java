package homework_nr_7;

public class MainDate {
    public static void main(String[] args) {
       Date d_1 = new Date(21, 1, 1996);
       Date d_2 = new Date(19, 9, 2023);
       Date d_3 = new Date(30, 2, 2000);
       Date d_4 = new Date(25, 15, 1900);

       System.out.println("Interesting facts:");
       System.out.println("Java 1.0 was presented " + d_1.getDay() + "/" + Date.monthName[d_1.getMonthIndex()] + "/" + d_1.getYear());
       System.out.println("Java 21 SE was released " + d_2.getDay() + "/" + Date.monthName[d_2.getMonthIndex()] + "/" + d_2.getYear());
       System.out.println("wrong day input " + d_3.getDay() + "/" + Date.monthName[d_3.getMonthIndex()] + "/" + d_3.getYear());
       System.out.println("wrong month input " + d_4.getDay() + "/" + Date.monthName[d_4.getMonthIndex()] + "/" + d_4.getYear());
    }
}

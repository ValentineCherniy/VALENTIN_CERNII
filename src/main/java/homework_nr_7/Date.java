// 6. Создайте класс Date, который будет представлять календарную дату. Класс будет содержать 3 атрибута,
// в которых будут храниться значения дня, месяца и года. Примените принцип инкапсуляции к этому классу.
// Каждый метод setter при вызове должен проверять правильность значения, которое будет присвоено переменной, например.
// значение месяца должно быть определено в диапазоне 1-12. Добавьте метод с именем displayDate, который будет
// отображать дату календаря на экране в следующем формате: день/месяц/год.
//7. Создайте объект типа Date. Используйте методы установки для инициализации атрибутов класса.
// Отобразите даты календаря на консоли.
package homework_nr_7;

public class Date {
    private int day = 0;
    private int monthIndex = 1;
    private int year = 0;

    public int getDay() {
        int monthLenth = 0;
        switch (monthIndex) {
            case 1, 3, 5, 7, 8, 10, 12:
                monthLenth = 31;
            break;
            case 4, 6, 9, 11:
                monthLenth = 30;
            break;
            case 2:
                monthLenth = 28;
            break;
            default:
                 monthLenth = 0;
        }
            if ((day > 0) & (day <= monthLenth)) {
                return day;
            } else {
                return 0;
            }

    }

//    public void setDay(int day) {
//        this.day = day;
//    }

    public int getMonthIndex() {
        if ((monthIndex >=1) & (monthIndex <=12)) {
            return monthIndex;
        } else {
            return 0;
        }
    }

//    public void setMonthIndex(int monthIndex) {
//        this.monthIndex = monthIndex;
//    }

    public int getYear() {
        return year;
    }

//    public void setYear(int year) {
//        this.year = year;
//    }

    public Date(int day, int monthIndex, int year) {
        this.day = day;
        this.monthIndex = monthIndex;
        this.year = year;
    }
    public static final String[] monthName = {"incorrect month index","Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

}



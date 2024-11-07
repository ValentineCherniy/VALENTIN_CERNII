package homework_nr_3;

public class Homework_3 {
    public static void main(String[] args) {

        int monthOfYear = 1;
        switch (monthOfYear) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("Enter number from 1 to 12");

        }


        for (int i = 100; i <= 1000; i+=5) {
            System.out.println(i);
        }

        float sum = 0F;
        for (int numerator = 1; numerator <= 97; numerator += 2){
            int denominator = numerator + 2;
            System.out.println("fraction check - " + numerator + "/" + denominator);
            sum = sum + (float)numerator / denominator;
            System.out.println("sum in progress = " + sum);
        }
        System.out.println("final sum of fractions = "+ sum);

    }
}

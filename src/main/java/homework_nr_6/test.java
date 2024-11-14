package homework_nr_6;

public class test {
    public static void main(String[] args) {
        boolean prime = false;
        int divider = 0;
        int number = 181;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                divider = i;
                break;
            } else {
                prime = true;
            }
        }
        System.out.println(prime);
        if (prime == true) {
            System.out.println( number + " is prime number");

        } else {
            System.out.println( number + " is not prime number. It divides at lest by " + divider);
        }
    }
}

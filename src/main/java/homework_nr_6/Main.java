package homework_nr_6;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{
                3, 7, 20, 6, 15, 9, 124, -16, 50, 44, 55, -3
        };

        System.out.println("The maximum number in array is " + ArrayUtils.findMax(numbers));
        System.out.println("The minimum number in array is " + ArrayUtils.findMin(numbers));

    }
}

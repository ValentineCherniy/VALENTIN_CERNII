package homework_nr_5;

public class HomeworkNr5 {
    public static void main(String[] args) {
        int sumOfEven = 0;
        long multOfOdd = 1;
        int[] numbers = new int[101];
        System.out.println("Array \"Numbers\":");
        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 - i;
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0){
                sumOfEven += numbers[i];
            } else {
                multOfOdd *= numbers[i];
            }
        }
        System.out.println();
        System.out.println("===========");
        System.out.println("Summary of even numbers in array \"Numbers\": " + sumOfEven);
        System.out.println("Multiplication of odd numbers in array \"Numbers\": " + multOfOdd);
        System.out.println("===========");



        int[] copyNumbers = new int[numbers.length];
        System.out.println("Array \"copyNumbers\":");
        for (int i =0; i < copyNumbers.length; i++) {
            copyNumbers[i] = numbers[i];
            System.out.print(copyNumbers[i] + " ");
        }
    }
}

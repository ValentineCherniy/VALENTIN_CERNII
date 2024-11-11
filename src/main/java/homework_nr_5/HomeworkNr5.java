package homework_nr_5;

public class HomeworkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        System.out.println("Array \"Numbers\":");
        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 - i;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] copyNumbers = new int[numbers.length];
        System.out.println("Array \"copyNumbers\":");
        for (int i =0; i < copyNumbers.length; i++) {
            copyNumbers[i] = numbers[i];
            System.out.print(copyNumbers[i] + " ");
        }
    }
}

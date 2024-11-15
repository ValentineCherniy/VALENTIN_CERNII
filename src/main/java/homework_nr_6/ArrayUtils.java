package homework_nr_6;

public class ArrayUtils {

        public static int findMax (int[] numbers){
            int max = numbers[0];
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }

        public static int findMin (int[] numbers){
            int min = numbers[0];
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }
    }


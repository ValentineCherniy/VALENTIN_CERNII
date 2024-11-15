package homework_nr_6;

//1. Создайте класс NumberUtils и определите в нем метод public static void main(String[] args) {}.
//2. Внутри класса определите статический метод isPrime(int number), который возвращает true, если число простое,
// и false в противном случае.
//3. Создайте статический метод findPrimesInArray(int[] numbers), который принимает массив чисел и выводит на консоль все
// простые числа в этом массиве, используя метод isPrime.
//4. В методе main инициализируйте массив чисел и вызовите метод findPrimesInArray, передав массив в качестве аргумента. У
// бедитесь, что результат выводится корректно.

public class NumberUtils {
    public static boolean isPrime(int number){
        boolean prime = false;
        if (number == 2) {prime = true;}
        else
        {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
        }
        return prime;
    }
}


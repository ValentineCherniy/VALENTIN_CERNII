package homework_nr_9.playground;

import java.util.*;

public class tests_hashSet {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter test string:");
        String testString = scanner.nextLine();

        Set<Character> setChar = new HashSet<>();
        List<Character> getChairs = new ArrayList<>();

        for (int i = 0; i != testString.length(); i++){
            getChairs.add(testString.charAt(i));
        }
        setChar.addAll(getChairs);

        System.out.println("the string is: " + "\"" + testString + "\"" );
        System.out.println("whole symbol's list is: " + getChairs);
        System.out.println("the unique symbols in the string " + "\"" + testString + "\" are " + setChar);
    }
}

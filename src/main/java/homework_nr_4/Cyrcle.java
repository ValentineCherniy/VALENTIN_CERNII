package homework_nr_4;

public class Cyrcle {
    public static void main(String[] args) {
        int radius = 5;
        double Area = calculateArea(radius);
        System.out.println(Area);

    }
    public static double calculateArea(int inputRadius){
        double CalculatingAreaOfCyrcle = Math.PI * Math.pow(inputRadius, 2);
        return CalculatingAreaOfCyrcle;
    }
}

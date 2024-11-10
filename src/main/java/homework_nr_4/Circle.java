package homework_nr_4;

public class Circle {
    public static void main(String[] args) {
        int Radius = 5;
        double Area = calculateArea(Radius);
        System.out.println("The area of a circle with radius " + Radius + " is " + Area);

    }
    public static double calculateArea(int inputRadius){
        double CalculatingAreaOfCircle = Math.PI * Math.pow(inputRadius, 2);
        return CalculatingAreaOfCircle;
    }
}

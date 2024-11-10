package homework_nr_4;

public class Circle {
    public static void main(String[] args) {
        float Radius = 5.5F;
        double Area = calculateArea(Radius);
        System.out.println("The area of a circle with radius " + Radius + " units is " + Area + " units^2");

    }
    public static double calculateArea(float inputRadius){
        double CalculatingAreaOfCircle = Math.PI * Math.pow(inputRadius, 2);
        return CalculatingAreaOfCircle;
    }
}

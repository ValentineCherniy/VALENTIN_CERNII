package homework_nr_4;

public class Circle {
    public static void main(String[] args) {
        float radius = 5.5F;
        double area = calculateArea(radius);
        System.out.println("The area of a circle with radius " + radius + " units is " + area + " units^2");

    }
    public static double calculateArea(float inputRadius){
        double calculatingAreaOfCircle = Math.PI * Math.pow(inputRadius, 2);
        return calculatingAreaOfCircle;
    }
}

package homework_nr_4;

public class Main {
    public static void main(String[] args) {
        float radius = 5.5F;
        double area = calculateArea(radius);
        System.out.println("The area of a circle1 with radius " + radius + " units is " + area + " units^2");
        float r = 55F;
        System.out.println("The area of a circle2 with radius " + r + " units is " + calculateArea(r) + " units^2");

    }
    public static double calculateArea(float inputRadius){
        double calculatingAreaOfCircle = Math.PI * Math.pow(inputRadius, 2);
        return calculatingAreaOfCircle;
    }


}

package homework_nr_4;

public class Main {
    public static void main(String[] args) {
        float radiusM = 5.5F;
        double area = calculateArea(radiusM);
        System.out.println("The area of a circle1 with radius " + radiusM + " units is " + area + " units^2");
        float radiusC = 55F;
        System.out.println("The area of a circle2 with radius " + radiusC + " units is " + Circle.CircleArea(radiusC) + " units^2");

    }
    public static double calculateArea(float inputRadius){
        double calculatingAreaOfCircle = Math.PI * Math.pow(inputRadius, 2);
        return calculatingAreaOfCircle;
    }


}

package homework_nr_4;

public class TemperatureConverter {

    public static float toCelsius(float farenheit) {
        return (farenheit - 32) * 5 / 9;
    }

    public static float toFahrenheit(float celsius) {
        return celsius * 9 / 5 + 32;
    }
}





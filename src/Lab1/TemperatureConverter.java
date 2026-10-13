
public class TemperatureConverter {

    double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

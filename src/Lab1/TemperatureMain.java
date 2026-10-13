
import java.util.Scanner;

public class TemperatureMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TemperatureConverter converter = new TemperatureConverter();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = converter.convertToFahrenheit(celsius);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();

        double celsiusResult = converter.convertToCelsius(fahrenheitInput);

        System.out.println("Temperature in Celsius: " + celsiusResult);

        input.close();
    }
}

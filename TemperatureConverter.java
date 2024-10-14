import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // creates a scanner
        Scanner scanner = new Scanner(System.in);

        // takes celsius as input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // convert celsius to fahrenheit
        double temp = Math.round((celsius * 9/5) + 32);

        // get state from temperature
        String state;
        if (temp >= 85) {
            state = "Hot.";
        } else if (temp >= 60) {
            state = "Moderate.";
        } else {
            state = "Cold.";
        }

        //output temperature in farenheit + state
        System.out.printf("Temperature in Fahrenheit: " + temp + "°F. It's " + state);
    }
}

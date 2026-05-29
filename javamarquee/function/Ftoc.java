package function;

public class Ftoc {
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = convertToFahrenheit(celsius);
        System.out.println(fahrenheit);
    }
}

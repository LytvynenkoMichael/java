/**
 * Michael Litvinenko
 */
package lemon_school_homework;

//Дано значение температуры в градусах Цельсия. Вывести температуру  в градусах Фаренгейта.

import java.util.InputMismatchException;

public class Task16 {
    public static double convertCelsiusForKelvin(double celsius) {
        return ((celsius * 1.8) + 32);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter your 'Celsius' for convert to 'Kelvin'");
            double celsius = Task1.readFromConsole();
            System.out.printf("You convert %.1fC to %.1fK", celsius, convertCelsiusForKelvin(celsius));
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your " +
                    "application with valid type = 'double'");
            e.printStackTrace();
        }
    }
}

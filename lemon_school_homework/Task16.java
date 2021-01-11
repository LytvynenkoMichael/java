/**
 * Michael Litvinenko
 */
package lemon_school_homework;

//Дано значение температуры в градусах Цельсия. Вывести температуру  в градусах Фаренгейта.

import lemon_school_homework.operator.ReadDouble;


public class Task16 {
    public static double convertCelsiusForKelvin(double celsius) {
        return ((celsius * 1.8) + 32);
    }

    public static void main(String[] args) {

        System.out.println("Enter your 'Celsius' for convert to 'Kelvin'");
        double celsius = ReadDouble.read();
        System.out.printf("You convert %.1fC to %.1fK", celsius, convertCelsiusForKelvin(celsius));

    }
}

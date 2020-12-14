/**
 * Michael Litvinenko
 */
package lemon_school_homework;

/*
Пользователь вводит задает расстояние до места назначения (N) и время, за которое нужно доехать (T).
Вычислить скорость (км/ч), с которой нужно ехать.
*/

import java.util.InputMismatchException;

public class Task12 {
    public static double findSpeed(double way, double time) {
        return way / time;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Find speed: ");
            System.out.print("Enter way in 'km' = \n");
            double way = Task1.readFromConsole();
            System.out.print("Enter time in 'h' = h\n");
            double time = Task1.readFromConsole();
            System.out.printf("\nYou need drive with speed = %.1fkm/h", findSpeed(way, time));
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your " +
                    "application with valid type = 'double'");
            e.printStackTrace();
        }
    }
}

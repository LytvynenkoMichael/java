/**
 * Michael Litvinenko
 */
package lemon_school_homework;

import java.util.InputMismatchException;

//Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.

public class Task6 {
    public static double yourWeightOnMoon(double yourWeight) {
        yourWeight = yourWeight * (1 - 0.17);
        System.out.printf("Your weight on Moon is %.1f", yourWeight);
        return yourWeight;
    }

    public static void main(String[] args) {
        System.out.println("Enter your weight: ");
        try {
            yourWeightOnMoon(Task1.readFromConsole());
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your application " +
                    "with valid type = 'double'");
            e.printStackTrace();
        }
    }
}


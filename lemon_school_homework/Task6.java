/**
 * Michael Litvinenko
 */
package lemon_school_homework;

import lemon_school_homework.operator.ReadInteger;

//Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.

public class Task6 {
    public static double yourWeightOnMoon(double yourWeight) {
        yourWeight = yourWeight * (1 - 0.17);
        System.out.printf("Your weight on Moon is %.1f", yourWeight);
        return yourWeight;
    }

    public static void main(String[] args) {

        System.out.println("Enter your weight: ");
        yourWeightOnMoon(ReadInteger.read());
    }
}


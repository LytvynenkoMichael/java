/**
 * Michael Litvinenko
 */
package lemon_school_homework;

//Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.

import lemon_school_homework.operator.ReadDouble;


public class Task13 {
    static void hourMinuteSecond(double day) {
        System.out.printf("In %.1f day(s) %.0f hours\n", day, day * 24);
        System.out.printf("In %.1f day(s) %.0f minutes\n", day, day * 24 * 60);
        System.out.printf("In %.1f day(s) %.0f seconds\n", day, day * 24 * 360);
    }

    public static void main(String[] args) {

        System.out.println("Please enter your quantity of days");
        hourMinuteSecond(ReadDouble.read());

    }
}

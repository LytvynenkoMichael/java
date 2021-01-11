/**
 * Michael Litvinenko
 */
package lemon_school_homework;

//Сделайте программу, которая будет проверять является ли число типа double целым

import lemon_school_homework.operator.ReadDouble;


public class Task10 {
    public static boolean isBooleanAreWholeNumber(double number) {
        if (Math.abs(Math.round(number) - number) < 0.0000000000000000000000000000000001) {
            System.out.println("Your double is whole number");
            return true;
        }
        System.out.println("Your double isn't whole number");
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Enter  double for check number is whole or not");
        isBooleanAreWholeNumber(ReadDouble.read());
    }
}

/**
 * Michael Litvinenko
 */
package lemon_school_homework;

import lemon_school_homework.operator.ReadInteger;


public class Task9 {
    public static boolean isNatural(int number) {
        if (number % 2 == 0 && number != 0) {
            System.out.print("This number " + number + " is even\n");
            return true;
        } else {
            System.out.print("This number " + number + " isn't even\n");
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter  number for check number is even or not");
        isNatural(ReadInteger.read());

    }
}

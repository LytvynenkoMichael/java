/**
 * Michael Litvinenko
 */
package lemon_school_homework;

import java.util.InputMismatchException;

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
        try {
            System.out.println("Enter  number for check number is even or not");
            isNatural((int) Task1.readFromConsole());
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your application with valid type = 'int'");
            e.printStackTrace();
        }
    }
}

/**
 * Michael Litvinenko
 */
package lemon_school_homework;
//Напишите программу которая определяет какое из чисел больше

import java.util.InputMismatchException;

public class Task8 {
    public static void whatNumberBigger(int first, int second) {
        if (first > second) {
            System.out.println(first + " --> " + second);
        } else if (first < second) {
            System.out.println(second + " <-- " + first);
        } else {
            System.out.println("They are equal");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter two numbers for compare");
            whatNumberBigger((int) Task1.readFromConsole(), (int) Task1.readFromConsole());
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your application with valid type = 'int'");
            e.printStackTrace();
        }
    }
}
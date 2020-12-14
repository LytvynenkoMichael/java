/**
 * Michael Litvinenko
 */
package lemon_school_homework;

/*В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
*/

import java.util.InputMismatchException;

public class Task4 {
    static long rounding(double a) {
        return Math.round(a);
    }

    public static void main(String[] args) {
        System.out.println("Enter your double number for rounding: ");
        try {
            System.out.println("Your result: " + rounding(Task1.readFromConsole()));
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your application " +
                    "with valid type = 'double'");
            e.printStackTrace();
        }
    }
}


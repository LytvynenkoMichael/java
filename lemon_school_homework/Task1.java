/**
 * Michael Litvinenko
 */
package lemon_school_homework;

//В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат
// деления q на w с остатком. Пример вывода программы
// (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.

import lemon_school_homework.operator.ReadInteger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static int divisionWithRemain(int a, int b) {
//        return a % b;
        return Math.floorMod(a, b);
    }

    static double readFromConsole() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        System.out.println("Enter your integer numbers for division with remain");
        System.out.println("Your result: " + divisionWithRemain(ReadInteger.read(), ReadInteger.read()));
    }
}

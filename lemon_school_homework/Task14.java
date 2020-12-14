/**
 * Michael Litvinenko
 */
package lemon_school_homework;

//Напишите метод переводящий гривны в доллары по заданному курсу. В качестве аргументов передайте кол-во гривен и курс.

import java.util.InputMismatchException;

public class Task14 {
    public static double convertUahToUsd(double uah, double usd) {
        return uah / usd;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter your  quantity of UAH: ");
            double uah = Task1.readFromConsole();
            System.out.println("Enter current USD rate: ");
            double usd = Task1.readFromConsole();
            System.out.printf("You convert %.1f UAH to %.1f USD", uah, convertUahToUsd(uah, usd));
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your " +
                    "application with valid type = 'double'");
            e.printStackTrace();
        }
    }
}

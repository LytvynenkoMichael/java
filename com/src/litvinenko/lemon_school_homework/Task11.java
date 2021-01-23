/**
 * Michael Litvinenko
 */
package litvinenko.lemon_school_homework;

/*Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.*/

import litvinenko.lemon_school_homework.operator.ReadLine;


public class Task11 {

    public static void main(String[] args) {
        System.out.println("Please enter your first name: ");
        System.out.printf("Hello %s", ReadLine.read());
    }
}

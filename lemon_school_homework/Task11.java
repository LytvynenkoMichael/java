/**
 * Michael Litvinenko
 */
package lemon_school_homework;

/*Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static String readStringMethod() {
        String firstName = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            firstName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return firstName;
    }

    public static void main(String[] args) {
        System.out.println("Please enter your first name: ");
        System.out.printf("Hello %s", readStringMethod());
    }
}

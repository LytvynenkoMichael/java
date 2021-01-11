package lemon_school_homework.operator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInteger {

    public static Integer read() {

        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your application with valid type = 'int'");
            e.printStackTrace();
        }
        return null;
    }
}

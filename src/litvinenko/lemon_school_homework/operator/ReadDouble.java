package litvinenko.lemon_school_homework.operator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadDouble {


    public static Double read() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You entered not valid arguments.\nPlease restart your application with valid type = 'double'");
            e.printStackTrace();
        }
        return null;
    }
}

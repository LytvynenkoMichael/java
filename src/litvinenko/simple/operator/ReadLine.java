package litvinenko.lemon_school_homework.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {

    public static String read() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

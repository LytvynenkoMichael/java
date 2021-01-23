package litvinenko.io_homework;

import java.io.File;
import java.io.IOException;

public class TestMain {
    public static void main(String[] args) {
        SingleToneReadWrite st = SingleToneReadWrite.getInstance();
        File file = null;
        String filename = "Pushkin.txt";
        String path = "src/io_homework";

        try {
            file = st.createFile(path, filename);
            System.out.println("Create file name: " + filename
                    + "\nin directory: " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        st.writeToFile(file, Text.CONTENT_OAK);
        st.countWordsInFile(file);
//        System.out.println(st.readTextFromFile(file));

//        st.writeToFile(file, "В Привет до проверка");
//        st.countWordsInFile(file);
//        System.out.println(st.readTextFromFile(file));
        st.countPrepositions(file);
//        st.copyFileToDirectory(file, "src/");
    }
}

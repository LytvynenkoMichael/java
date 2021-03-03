package litvinenko.io_task;

import java.io.File;
import java.io.IOException;

public class TestMain {
    public static void main(String[] args) {
        SingleToneReadWrite st = SingleToneReadWrite.getInstance();
        String filename = "src/litvinenko/io_homework/oak_verse";
        File file = new File(filename);
        String path = "src/io_homework";

//        try {
//            file = st.createFile(path, filename);
//            System.out.println("Create file name: " + filename
//                    + "\nin directory: " + path);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        st.countWordsInFile(file);
//        System.out.println(st.readTextFromFile(file));

//        st.writeToFile(file, "В Привет до проверка");
//        st.countWordsInFile(file);
//        System.out.println(st.readTextFromFile(file));
        st.countPrepositions(file);
//        st.copyFileToDirectory(file, "src/");
    }
}

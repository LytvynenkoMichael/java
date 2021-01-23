package litvinenko.io_homework;

import java.io.File;
import java.io.IOException;

public class DirectoryAndFile {

    public String showAbsolutePath(String path) {
        StringBuilder sb = new StringBuilder();
        File file = new File(path);
        if (file.exists()) {
            sb.append(file.getAbsolutePath());
            return sb.toString();
        } else {
            System.out.print("File not exist");
            return "";
        }
    }

    public void showAllDirectoriesAndFiles(String directoryPath) {
        File[] filesAndDirs = new File(directoryPath).listFiles();

        if (filesAndDirs != null) {
            for (File f : filesAndDirs) {
                if (f.isDirectory()) {
                    System.out.println("Dir---> " + f.getName());
                } else {
                    System.out.println("File--> " + f.getName());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        DirectoryAndFile directoryAndFile = new DirectoryAndFile();
        String path = "src/";
        String path1 = "src/io_homework/Pushkin.txt";
        File file = new File(path1);
        System.out.println(directoryAndFile.showAbsolutePath(path));
        directoryAndFile.showAllDirectoriesAndFiles(path);

    }

}

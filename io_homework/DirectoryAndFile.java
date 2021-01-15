package io_homework;

import java.io.File;
import java.io.IOException;

public class DirectoryAndFile {

    public static void showAllDirectoriesAndFiles(String directoryPath) throws IOException {

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
        showAllDirectoriesAndFiles("src/");
    }

}

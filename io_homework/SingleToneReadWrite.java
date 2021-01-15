package io_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SingleToneReadWrite {

    private static SingleToneReadWrite singleToneTest;

    private SingleToneReadWrite() {
    }

    public static SingleToneReadWrite getInstance() {
        if (singleToneTest == null) {
            singleToneTest = new SingleToneReadWrite();
            return singleToneTest;
        } else {
            return singleToneTest;
        }
    }

    public File createFile(String path, String fileName) throws IOException {
        File file = new File(path, fileName);
        if (file.exists()) {
            System.out.println("File is exist");
        } else {
            file.createNewFile();
        }
        return file;
    }

    public void writeToFile(File file, String str) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            byte[] b = str.getBytes();
            fileOutputStream.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readTextFromFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                stringBuilder.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    public int countWordsInFile(File file) {
        String[] str = readTextFromFile(file).split("\\s+");
        Integer count = 0;
        for (int i = 0; i < str.length; i++) {
            count++;
        }
        return count;
    }
}

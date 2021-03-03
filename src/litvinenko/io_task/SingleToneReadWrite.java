package litvinenko.io_task;

import java.io.*;

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
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), "UTF-8"))) {
            bufferedWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readTextFromFile(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), "UTF-8"))) {
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public int countWordsInFile(File file) {
        String[] str = readTextFromFile(file).split("\\s+");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            count++;
        }
        System.out.println("In this text " + count + " words.");
        return count;
    }

    public int countPrepositions(File file) {
        String[] str = readTextFromFile(file).split("\\s+");
        int count = 0;
        int totalCount = 0;

        for (int i = 0; i < Text.PREPOSITIONS.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (Text.PREPOSITIONS[i].equalsIgnoreCase(str[j])) {
                    count++;
                    totalCount++;
                }
            }
            if (count > 0) {
                System.out.println(Text.PREPOSITIONS[i] + " count --> " + count);
            }
            count = 0;
        }

        System.out.println("Sum of prepositions --> " + totalCount);

        return totalCount;
    }

    public void copyFileToDirectory(File file, String newDirectoryPath) {
        try {
            File newFile = createFile(newDirectoryPath, file.getName());
            writeToFile(newFile, readTextFromFile(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


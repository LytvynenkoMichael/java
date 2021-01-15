package io_homework;

import java.io.File;
import java.io.IOException;

public class TestMain {
    public static void main(String[] args) {
        SingleToneReadWrite st = SingleToneReadWrite.getInstance();
        File file = null;
        String filename = "Text.txt";
        String path = "src/";
        String content = "У лукоморья дуб зелёный;\n" + "Златая цепь на дубе том:\n" + "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" + "Идёт направо — песнь заводит,\n" + "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" + "Русалка на ветвях сидит;\n" + "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n" + "Избушка там на курьих ножках\n" + "Стоит без окон, без дверей;\n" +
                "Там лес и дол видений полны;\n" + "Там о заре прихлынут волны\n" + "На брег песчаный и пустой,\n" +
                "И тридцать витязей прекрасных\n" + "Чредой из вод выходят ясных,\n" + "И с ними дядька их морской;\n" +
                "Там королевич мимоходом\n" + "Пленяет грозного царя;\n" + "Там в облаках перед народом\n" +
                "Через леса, через моря\n" + "Колдун несёт богатыря;\n" + "В темнице там царевна тужит,\n" +
                "А бурый волк ей верно служит;\n" + "Там ступа с Бабою Ягой\n" + "Идёт, бредёт сама собой,\n" +
                "Там царь Кащей над златом чахнет;\n" + "Там русский дух… там Русью пахнет!\n" +
                "И там я был, и мёд я пил;\n" + "У моря видел дуб зелёный;\n" + "Под ним сидел, и кот учёный\n" +
                "Свои мне сказки говорил.";
        try {
            file = st.createFile(path, filename);
            System.out.println("Create file name: " + filename
                    + "\nin directory: " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        st.writeToFile(file, content);
        System.out.println(st.countWordsInFile(file));
        System.out.println(st.readTextFromFile(file));
    }
}

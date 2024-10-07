import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ArrayOperations {
    public static void findMinMaxAndLog(int[] arr) throws IOException {
        // Создание файла и открытие его для записи
        File file = new File("log.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));


        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }


        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        writer.write(sdf.format(date) + " {min=" + min + ", max=" + max + "}\n");
        writer.flush();


        writer.close();
    }

    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        findMinMaxAndLog(arr);
    }
}

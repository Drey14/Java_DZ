package Seminar.java_2.DZ.task_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;


class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort (int[] mas) throws IOException {
        Date date = new Date ();
        log = new File ("/Users/aiiganty/IdeaProjects/ru.gb.java_base/src/main/java/Seminar/java_2/DZ/task_2/log.txt");
        fileWriter = new FileWriter (log,true);
        int buffer = 0;
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            min = mas[i];
            for (int j = i + 1; j < mas.length; j++) {
                if (min <= mas[j]) {
                } else {
                    buffer = min;
                    min = mas[j];
                    mas[i] = min;
                    mas[j] = buffer;
                }
            }
            buffer = 0;
            min = 0;
            //String str = String.format ("%d-%d-%d %d:%d %d",date.getYear (),date.getMonth (),date.getDay (),date.getHours (),date, date.getMinutes (),mas.toString());
            String strArray = Arrays.stream(mas)
                    .mapToObj(String::valueOf)
                    .reduce((x, y) -> x + ", " + y)
                    .get();

            fileWriter.write("2023-05-19 07:53 "+"["+strArray+"]\n");
            fileWriter.flush ();
        }
    }

    public static void main (String[] args) throws IOException {
        BubbleSort.sort (new int[]{10,34,5,1});
    }
}



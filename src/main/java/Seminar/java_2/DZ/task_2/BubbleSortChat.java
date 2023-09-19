package Seminar.java_2.DZ.task_2;

import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;



public class BubbleSortChat {

    public static void sort(int[] mas) {

        int n = mas.length;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try (PrintWriter writer = new PrintWriter(new FileWriter("/Users/aiiganty/IdeaProjects/ru.gb.java_base/src/main/java/Seminar/java_2/DZ/log.txt"))) { // открываем файл для записи

            for (int i = 0; i < n - 1; i++) {

                for (int j = 0; j < n - i - 1; j++) {

                    if (mas[j] > mas[j + 1]) {

                        int temp = mas[j];

                        mas[j] = mas[j + 1];

                        mas[j + 1] = temp;

                    }

                }

                writer.println(dtf.format(LocalDateTime.now()) + " " + arrayToString(mas)); // записываем текущее состояние массива в лог-файл

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }



    private static String arrayToString(int[] arr) {

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < arr.length; i++) {

            sb.append(arr[i]);

            if (i != arr.length - 1) {

                sb.append(", ");

            }

        }

        sb.append("]");

        return sb.toString();

    }

}

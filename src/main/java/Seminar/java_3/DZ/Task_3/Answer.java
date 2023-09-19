package Seminar.java_3.DZ.Task_3;

import java.util.Arrays;


public class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        Arrays.sort (arr);
        System.out.println (Arrays.toString (arr));
        System.out.println ("Minimum is "+arr[0]);
        System.out.println ("Maximum is "+arr[arr.length-1]);
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println ("Average is = "+sum/arr.length);

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}
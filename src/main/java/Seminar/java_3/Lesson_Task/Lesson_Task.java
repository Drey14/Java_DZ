package Seminar.java_3.Lesson_Task;

/*
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

String s1 = "hello";

String s2 = "hello";

String s3 = s1;

String s4 = "h" + "e" + "l" + "l" + "o";

String s5 = new String("hello");

String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

Текст задачи:
Заполнить список десятью случайными числами. Отсортировать
список методом sort() и вывести его на экран.

Текст задачи:
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.

Текст задачи:
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
*/

import java.util.*;

public class Lesson_Task {

    public static void main (String[] args) {
//        ArrayList<Integer> integerArrayList = new ArrayList<> ();
//        Random random = new Random ();
//        for (int i = 0; i < 10 ; i++) {
//            integerArrayList.add (random.nextInt (100));
//        }
//        integerArrayList.sort (new Comparator<Integer> () {
//            @Override
//            public int compare (Integer o1, Integer o2) {
//               return o1.compareTo (o2);
//            }
//        });
//
//        System.out.println (integerArrayList);

        List<String> listAtr = new ArrayList<> (Arrays.asList ("qwewr","1","zxs","2"));
        Iterator<String> iterator = listAtr.iterator ();
        while (iterator.hasNext ()) {
            String s = iterator.next ();
            System.out.println (Lesson_Task.isNumeric(s));
            if(Lesson_Task.isNumeric(s)){
                iterator.remove();
            }
        }
        System.out.println (listAtr);
        }
        public static boolean isNumeric(String s) {
        try {
            Integer.parseInt (s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    }


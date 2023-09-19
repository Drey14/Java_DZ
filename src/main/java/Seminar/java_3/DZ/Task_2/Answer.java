package Seminar.java_3.DZ.Task_2;

import java.util.Arrays;
import java.util.function.Predicate;

class Printer{
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,10,3,5,6,7,9};
        Answer.removeEvenNumbers (arr);
    }
     void strLine(String mes){
        mes = "asd";
    }
}

public class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        System.out.println (Arrays.toString (Arrays.stream(arr).filter (new Predicate<Integer> () {
            @Override
            public boolean test (Integer integer) {
                if(integer%2==0){
                    return false;
                }else {
                    return true;
                }
            }
        }).toArray()));
    }
}
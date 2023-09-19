package Seminar.java_2.DZ.task_1;
import com.google.gson.Gson;
import java.util.Map;


public class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        StringBuilder bulder = new StringBuilder();
        Gson gson = new Gson ();
        Map<String,String> map = gson.fromJson (PARAMS,Map.class);
        for (Map.Entry entry: map.entrySet ()) {
            if (entry.getValue ().equals ("null")){

            }else {
                bulder.append (entry+" AND ");
            }
        }
        return bulder;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
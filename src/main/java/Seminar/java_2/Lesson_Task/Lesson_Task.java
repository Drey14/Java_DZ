package Seminar.java_2.Lesson_Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lesson_Task {
    public static class Tasks {
        static int N = 6;
        static char c1 = 'a';
        static char c2 = 'b';
        static boolean flag = true;

        String newStringMethod(char e1,char e2, int number){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < number; i++) {
                if (flag) {
                    stringBuilder.append (c1);
                    flag = false;
                }else {
                    stringBuilder.append (c2);
                    flag = true;
                }
            }
            return stringBuilder.toString ();
        }

        String compressStr (String str, char c1, char c2){
            int countC1 = 0;
            int countC2 = 0;
            for (int i = 0; i < str.length () ; i++) {
                if (str.charAt (i) == c1){
                    countC1++;
                }else {
                    countC2++;
                }
            }
            return String.format ("%c%d%c%d",c1,countC1,c2,countC2);
        }

        boolean palindromeStr(String str){
            if(str.equals (new StringBuilder (str).reverse ().toString ())){
                return true;
            }else {
                return false;
            }
        }

        String str100Test(){
            String s = "Test";
            int count = 100;
            StringBuilder stringBuilder = new StringBuilder ();
            for (int i = 0; i < count ; i++) {
                stringBuilder.append (s);
            }
            return stringBuilder.toString ();
        }

        boolean writeFileString(String str, String path){
            try {
                File fileStr = new File (path);
                FileWriter fileWriter = new FileWriter (fileStr,false);
                fileWriter.write (str);
                fileWriter.flush ();
                return fileStr.length ()>0;
            } catch (IOException e) {
                e.printStackTrace ();
                return false;
            }
        }

        public static void main (String[] args) throws IOException {
            Tasks tasks = new Tasks ();
            Logger log = Logger.getLogger (Tasks.class.getName());
            log.log (Level.INFO,"WoW!");
    //        ConsoleHandler consoleHandler = new ConsoleHandler ();
    //        log.addHandler (consoleHandler);
            FileHandler fileLogger = new FileHandler("/Users/aiiganty/IdeaProjects/ru.gb.java_base/src/main/java/Seminar/java_2/log.txt");
            SimpleFormatter simpleFormatter = new SimpleFormatter ();
            SimpleFormatter sFormat = new SimpleFormatter();
            fileLogger.setFormatter(sFormat);

            //System.out.println (new Tasks ().newStringMethod (c1,c2,N));
            //System.out.println (tasks.compressStr (tasks.newStringMethod (c1,c2,N),c1,c2));
            // System.out.println (tasks.palindromeStr ("кок"));
            String str100 = tasks.str100Test ();
            System.out.println (tasks.writeFileString (str100,"/Users/aiiganty/IdeaProjects/ru.gb.java_base/src/main/java/Seminar/java_2/in.txt"));
        }


    }
}

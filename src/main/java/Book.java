import java.util.*;

public class Book {
    public static void main (String[] args) {
        Map<String, ArrayList<Integer>> listMap = new HashMap<> ();
        listMap.put ("Ivan", new ArrayList<> (Arrays.asList (1233333, 333333, 443334, 333333, 2222)));
        listMap.put ("Igor", new ArrayList<> (Arrays.asList (21233333, 333333, 443334, 333333)));
        listMap.put ("Bob", new ArrayList<> (Arrays.asList (1233333, 333333, 443334)));
        listMap.put ("John", new ArrayList<> (Arrays.asList (1233333)));
        listMap.put ("Vlass", new ArrayList<> (Arrays.asList (1233333, 333333, 443334)));
        listMap.put ("Sergey", new ArrayList<> (Arrays.asList (1233333, 333333, 443334, 333333, 222223, 3333333)));

        listMap.entrySet ().stream ()
                .sorted (new Comparator<Map.Entry<String, ArrayList<Integer>>> () {
                    @Override
                    public int compare (Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
                        if (o1.getValue ().size () - o2.getValue ().size () > 0) {
                            return 1;
                        } else if (o1.getValue ().size () == o2.getValue ().size ()) {
                            return 0;
                        } else {
                            return - 1;
                        }
                    }
                }.reversed ())
                .forEach (System.out :: println);
    }
}



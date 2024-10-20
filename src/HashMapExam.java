import java.util.HashMap;
import java.util.Map;


public class HashMapExam {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Mikhail",39);
        map.put("Mikhail",40);
        map.put("Irina",33);
        map.remove("Mikhail");

        System.out.println(map);

      //  String name = "Mikhail";
      //  System.out.println(name.hashCode());

        System.out.println(map.get("Mikhail"));
        for (Map.Entry<String,Integer> entry: map.entrySet()
             ) {
            System.out.println("Имя: " + entry.getKey() + " Возраст: " + entry.getValue());

        }



    }
}


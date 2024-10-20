import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Создадим HsashMap. Ключом будет имя человека, а значение возраст

        Map<String,Integer> map = new HashMap<>();
        // Добавим элементы ключ/значение
        map.put("Mikhail",39);
        map.put("Irina",33);
        map.put("Roma",6);

        // получим значение по ключу
        Integer ageOfIrina = map.get("Irina");
        System.out.println("Возраст Irina = " + ageOfIrina);

        // Удалим значение по ключу
        map.remove("Irina");

        // Проверка наличия ключа
        System.out.println("Содержит ли HashMap ключ 'Irina': " +
                                        map.containsKey("Irina"));

        // Итерация по элементам HashMap
        System.out.println("Итерация по элементам HashMap");
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + " Возраст: " + entry.getValue());

        }


    }
}

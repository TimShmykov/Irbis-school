package Lesson5;

import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lesson5 sq = new Lesson5();
        int squad = sq.squad(4); // типа объявляем инт сквад так как метод вернул нам значение и нам это значение надо записать
        sq.print(squad);
        int squad1 = sq.squad(5);
        sq.print(squad1);

        List<String> list = new ArrayList<>(); // обратились к листу
        list.add("Привет");// добавили значения в лист Хранится в ячейке 0
        String s = list.get(0);

        list.addAll(List.of("аабв", "гдеёж", "a", "a")); //

        list.remove("a");  // убираем значение под 0

        list.contains("c");

        for (String s1 : list) { // for each для листа
            System.out.println(s1);
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);

        set.addAll(Set.of(33,42,64,4,5,6,7,8));
        for (Integer integer : set) {
            System.out.println(integer);
        }

        // сортированный список

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.putAll(Map.of("b",2,"c",3,"d",4));
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry);
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            System.out.println(key);
            System.out.println(value);

        }
        Integer a = map.get("c"); // возвращает значение а
        System.out.println(a);


    }
}
// коллекции - крутые массивы


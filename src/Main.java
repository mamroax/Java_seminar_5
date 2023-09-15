import java.util.*;

public class Main {
    /*public enum Words {
    Иван, Ольга, Василий, Николай, Арсений, Степан, Светлана;
}

String s = String.valueOf(Words.values()[new Random().nextInt(Words.values().length)]);*/

    /**
     * Создать мапу, ключ - случайная строка из энумератора,
     * значение - индекс первой буквы ключа. В мапу добавить 10 пар значений.
     */
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (linkedHashMap.size() < 10) {
            String s = String.valueOf(Test.values()[new Random().nextInt(Test.values().length)]);
            linkedHashMap.put(s, (int) s.charAt(0));

        }
        linkedHashMap.forEach((K, V) -> hashMap.put(K, V));
        linkedHashMap.clear();

        System.out.println(linkedHashMap);
        System.out.println(hashMap);
//        System.out.println("Hello world!");
        /*Вывести словарь отсортированный по порядку ввода и по хешу ключа */


        /*Вывести мапу отсортированный по значению */
//        System.out.println(hashMap.values());
//        ArrayList<Integer> list = new ArrayList<>();
//        list.addAll(hashMap.values());
//        list.sort(Comparator.naturalOrder());
//        System.out.println("Отсортированный " + list);
//
//        for (int v : list) {
//            for (String k : hashMap.keySet()) {
//                if (v == hashMap.get(k)) {
//                    System.out.print(k + " = " + v+", ");
//                }
//            }
//        }
        hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(5)
                .forEach(e -> linkedHashMap.put(e.getKey(), e.getValue()));
        hashMap.merge("Арсений", 12, (o, n) -> n + o);
        System.out.println(hashMap);
    }
}
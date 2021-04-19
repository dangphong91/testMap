import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Dương", 18);
        hashMap.put("Khánh", 20);
        hashMap.put("Tín", 22);
        hashMap.put("Phong", null);
        System.out.println("HashMap : \n" + hashMap);
        System.out.println("*********************");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap : \n" + treeMap);
        System.out.println("*********************");
        Map<String, Integer> linkedHastMap = new LinkedHashMap<>();
        linkedHastMap.put("Dương", 18);
        linkedHastMap.put("Khánh", 20);
        linkedHastMap.put("Tín", 22);
        linkedHastMap.put("Phong", null);
        System.out.println("LinkedHashMap : \n" + linkedHastMap);
    }
}

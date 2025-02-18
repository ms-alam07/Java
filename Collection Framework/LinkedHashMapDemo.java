import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with access order enabled (Least Recently Used removal)
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>(5, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> e) {
                return size() > 5; // Restrict size to 5, remove least recently used element
            }
        };

        // 1️⃣ Adding elements to LinkedHashMap
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");

        // 2️⃣ Accessing elements
        String s = lhm.get(2); // Access key 2
        s = lhm.get(5); // Access key 5
        s = lhm.get(1); // Access key 1

        // 3️⃣ Adding another element (removes least recently used element)
        lhm.put(6, "F");

        // 4️⃣ Iterating using forEach
        System.out.println("\nIterating using forEach:");
        lhm.forEach((key, value) -> System.out.println(key + " -> " + value));

        // 5️⃣ Checking if a key exists
        System.out.println("\nDoes key 3 exist? " + lhm.containsKey(3));

        // 6️⃣ Checking if a value exists
        System.out.println("Does value 'D' exist? " + lhm.containsValue("D"));

        // 7️⃣ Getting the size of the LinkedHashMap
        System.out.println("Size of LinkedHashMap: " + lhm.size());

        // 8️⃣ Removing an element
        lhm.remove(4); // Removes key 4
        System.out.println("\nAfter removing key 4: " + lhm);

        // 9️⃣ Replacing a value
        lhm.replace(2, "Updated-B");
        System.out.println("\nAfter replacing key 2: " + lhm);

        // 🔟 Cloning the LinkedHashMap
        LinkedHashMap<Integer, String> clonedMap = (LinkedHashMap<Integer, String>) lhm.clone();
        System.out.println("\nCloned LinkedHashMap: " + clonedMap);

        // 1️⃣1️⃣ Checking if LinkedHashMap is empty
        System.out.println("Is LinkedHashMap empty? " + lhm.isEmpty());

        // 1️⃣2️⃣ Clearing all elements from LinkedHashMap
        lhm.clear();
        System.out.println("\nAfter clearing, is LinkedHashMap empty? " + lhm.isEmpty());
    }
}

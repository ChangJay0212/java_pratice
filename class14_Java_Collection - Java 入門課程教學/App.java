import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class App {    
    public static void main(String[] args) 
    {        
        // 1. ArrayList - 有序、可重複        
        System.out.println("--- ArrayList ---");        
        ArrayList<String> list = new ArrayList<>();        
        list.add("Apple");        
        list.add("Banana");        
        list.add("Apple"); 
        // ArrayList 允許重複        
        System.out.println("ArrayList: " + list);        
        System.out.println("第一個元素: " + list.get(0));        
        // 2. HashSet - 無序、不重複        
        System.out.println("\n--- HashSet ---");        
        HashSet<String> set = new HashSet<>();        
        set.add("Cat");        
        set.add("Dog");        
        set.add("Cat"); 
        // HashSet 會忽略重複的元素        
        System.out.println("HashSet: " + set);        
        System.out.println("包含 'Dog' 嗎? " + set.contains("Dog"));        
        // 3. HashMap - 鍵值對、鍵不重複        
        System.out.println("\n--- HashMap ---");        
        HashMap<String, Integer> map = new HashMap<>();        
        map.put("One", 1);        
        map.put("Two", 2);        
        map.put("Three", 3);        
        System.out.println("HashMap: " + map);        
        System.out.println("Key 'Two' 的 Value: " + map.get("Two"));    }}
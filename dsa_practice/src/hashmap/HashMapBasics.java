package hashmap;
import java.util.*;

public class HashMapBasics {

	
	public static void main(String[] args) {
		
		HashMap<String ,Integer> map= new HashMap<>();
		map.put("Vishnu", 98);
		map.put("Aarthi", 100);
		map.put("Sowmiya", 200);
		
		System.out.println(map.get("Vishnu"));
		System.out.println(map.getOrDefault("Vignesh",100));
		System.out.println(map.containsKey("Vishnu"));
		System.out.println(map.containsValue(100));
		
		HashSet<Integer> set =new HashSet<>();// hashset is used when u dont wwant any duplicates and it has contains which returns a boolean true
		set.add(12);
		set.add(12);
		set.add(113);
		set.add(1);
		
		TreeMap<String ,Integer> map1= new TreeMap<>();//treemap is internally same but it does in sorted order
		map1.put("Vishnu", 98);
		map1.put("Aarthi", 100);
		map1.put("Sowmiya", 200);
		System.out.println(set);
		System.out.println(set.contains(12));
		System.out.println(map.values());
		System.out.println(map1.values());// this gives values in sorted order due to treemap
	}
	 
}

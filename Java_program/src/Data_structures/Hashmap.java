package Data_structures;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*  1️⃣ What is a HashMap? (Very Simple Explanation)
A HashMap stores data in key → value pairs.
2️⃣ Why Do We Need HashMap?
Imagine you want to search data very fast.
5️⃣ Common HashMap Methods (VERY IMPORTANT)
Method	Use
put()	add data
get()	fetch value
containsKey()	check key
remove()	delete
keySet()	get all keys
values()	get all values

*/
		
		   HashMap<String, Integer> map = new HashMap<>();

	        map.put("Maths", 90);
	        map.put("Science", 85);
	        map.put("English", 88);
	        // This is to search for in Hashmap
	        System.out.println(map.get("Science")); // 85
	
	        Frequency_of_characters();{
	        	
	        }
	        
	
	}

	private static void Frequency_of_characters() {
		// TODO Auto-generated method stub
		String str = "automation";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
	}
	
	
}

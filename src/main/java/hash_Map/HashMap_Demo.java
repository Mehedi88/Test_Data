package hash_Map;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> cap = new HashMap<Integer,String>();
		cap.put(101,"Damurhuda");
		cap.put(102, "Lalmatia");
		cap.put(103,"Savar");
		
		System.out.println(cap.get(102));
		System.out.println(cap);
		
		for(Integer c :cap.keySet()) {
			System.out.println(c);
			
		}
		
		for(String i : cap.values()) {
			System.out.println(i);
			
			for(Integer j : cap.keySet()) {
				System.out.println(cap.get(j));
				
			}
			
		}

	}

}

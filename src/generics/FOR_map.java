package generics;
import java.util.*;
public class FOR_map {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "android");
		map.put(2,"web application");
		map.put(3,"Digital marketing");
		
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(" "+m.getKey()+" "+m.getValue());
		
		
		}

	}}


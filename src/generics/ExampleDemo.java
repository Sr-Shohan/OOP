package generics;
import java.util.*;
public class ExampleDemo {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Shohan");
		list.add("Jai");
		
		
		// know need to type casting
		System.out.println(list.get(1));
		
		for(String s:list) {
			System.out.println(s);
		}

	}

}

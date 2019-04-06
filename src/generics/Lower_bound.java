package generics;
import java.util.*;
public class Lower_bound {
	
	
	static void printListItems(List<Integer>list) {
		for(Integer num:list) {
			System.out.println(num);
		}
		
	}
	
	
	static void printListItems2(List<? super Integer>list) {
		for(Object nu:list) {
			System.out.println(nu);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

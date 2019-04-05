package generics;
import java.util.*;
public class Unbounded_generics {
	
	public static void processElements(List <?> elements) {
		for(Object o: elements) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
	List <Integer>ints =new ArrayList<>();
	ints.add(new Integer(3));
	ints.add(new Integer(5));
	ints.add(new Integer(12));
	processElements(ints);
	
	
	
	System.out.println();
	List<Double>dts=new ArrayList<>();
	dts.add(new Double(3.3));
	dts.add(new Double(5.6));
	dts.add(new Double(10));
	processElements(dts);

	}

}

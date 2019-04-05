package generics;

public class generic_class {

	public static void main(String[] args) {
		test_class<Integer>m= new test_class<Integer>();
		m.add(2);
		System.out.println("the number is "+m.get());
		
		
		test_class<String>  n=new test_class<String>();
		n.add("shohan");
		
		System.out.println("name: "+n.get()); 
	}

}

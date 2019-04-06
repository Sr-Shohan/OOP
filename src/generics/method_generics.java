package generics;

public class method_generics<T> {
	
	private T t;
	
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}

	public static void main(String[] args) {
		method_generics<Integer> list=new method_generics<Integer>();
		method_generics<String>word=new method_generics<String>();
		list.add(55);
		list.add(new Integer(42));
		
		word.add(new String("hello world"));
		
		System.out.println(list.get());
		System.out.println(word.get());
		
		

	}

}

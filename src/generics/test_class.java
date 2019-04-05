package generics;

public class test_class<T> {
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}

}
